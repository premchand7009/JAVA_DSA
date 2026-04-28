package JAVA_DSA;
import java.util.Scanner;
class Node{
    int info;
    Node next;
    Node(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter data to push:");
        info=sc.nextInt();
    }
}
public class Queue_UsingLinkedList {
    static Node front =null;
    static Node rear=null;

    public static void insert(){
        Node newnode=new Node();
        if(front==null&&rear==null){
            front=rear=newnode;
        }else{
            rear.next=newnode;
            rear=newnode;
        }
        System.out.println("Item inserted successfully.");
    }

    public static void delete() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println("Deleted item: " + front.info);
        front = front.next;

        if (front == null) {
            rear = null;
        }
    }

    public static void display() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue elements: ");
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.info + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n*** MENU ***");
            System.out.println("0: Exit");
            System.out.println("1: Insert");
            System.out.println("2: Delete");
            System.out.println("3: Display");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();


            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    insert();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    display();
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }



    
}
