package JAVA_DSA;
import java.util.Scanner;
public class Stack_UsingArray {

    public static final int MAX=10; 
    public static int push(int S[],int top){
        if(isFull(top)){
            System.out.println("Stack Underflow");
            return top;
        }
        Scanner sc =new Scanner(System.in);
        top++;
        System.out.println("Enter any data:");
        int a= sc.nextInt();
        S[top]=a;
        System.out.println("Successfully Pushed");
        return top;
    }

    public static int pop(int S[],int top){
        if(isEmpty(top)){
            System.out.println("Stack underflow");
            return top;
        }
        System.out.println("Deleted data is:"+S[top]);
        top--;
        System.out.println("Successfully popped");
        return top;
    }

    public static boolean isEmpty(int top){
        return top==-1;
    }

    public static boolean isFull(int top){
        return top==MAX;
    }

    public static void Display(int S[],int top){
        if(isEmpty(top)){
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("Stack Elements:");
        for(int i=0;i<=top;i++){
            System.out.print(S[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int s[]=new int[MAX];
        int top=-1;

        while (true) {
            System.out.println("\n***MENU***");
            System.out.println("0: Exit");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Display");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

           switch (choice) {
            case 0:
                 System.exit(0);
            case 1:
                 top=push(s,top);
                 break;
            case 2:
                 top=pop(s,top);
                 break;
            case 3:
                Display(s, top);
                break;
            default:
                System.out.println("Invalid Choice");
           }
        }
        
    }

    
}