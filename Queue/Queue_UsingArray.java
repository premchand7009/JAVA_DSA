package JAVA_DSA;

import java.util.Scanner;

public class Queue_UsingArray {
    public static final int MAX=10;
    public static int front=-1;
    public static int rear=-1;

    public static void insert(int Q[]){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the item to be inserted in queue: ");
        int item = sc.nextInt();
        if(front==-1&&rear==-1){
            front=0;
            rear=0;
        }else{
            rear++;
        }
        Q[rear]=item;
        System.out.println("Item inserted successfully.");
    }

    public static void delete(int Q[]){
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Deleted item is: "+Q[front]);

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front++;
        }
    }

    public static void display(int Q[]){
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Queue elements are:");
        for(int i=front;i<=rear;i++){
            System.out.print(Q[i]+" ");
        }
        System.out.println();
    }

    public static boolean isFull() {
        return rear == MAX - 1;
    }

    public static boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int queue[] = new int[MAX];

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
                    System.out.println("Exiting...");
                    System.exit(0);
                case 1:
                    insert(queue);
                    break;
                case 2:
                    delete(queue);
                    break;
                case 3:
                    display(queue);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        
    }
    
}
