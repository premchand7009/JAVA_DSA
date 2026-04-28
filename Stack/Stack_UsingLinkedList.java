package JAVA_DSA;
import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter data to push:");
        data=sc.nextInt();
    }
}

public class Stack_UsingLinkedList {

    static Node top=null;
    public static void push(){
        Node newNode=new Node();
        newNode.next=top;
        top=newNode;
        System.out.println("Successfully Pushed");
    }

    public static void pop(){
        if(isEmpty(top)){
            System.out.println("Stack Underflow. Nothing to pop");
            return;
        }
        System.out.println("Popped: " + top.data);
        top=top.next;
    }

    public static void peek(){
        if(isEmpty(top)){
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Top data:"+top.data);
    }

    public static void Display(){
        if(isEmpty(top)){
            System.out.println("Stack is Empty");
            return;
        }
        Node temp=top;
        System.out.println("Stack Elements:");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    
    public static boolean isEmpty(Node top){
        return top==null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n***** STACK MENU *****");
            System.out.println("0: Exit");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Peek");
            System.out.println("4: Display");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    push();
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    peek();
                    break;
                case 4:
                    Display();
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

    }
    
}
