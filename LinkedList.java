package JAVA_DSA;

import java.util.Scanner;

class Node_  {
    int data;
    Node_ next;
    Node_(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter data:");
        data=sc.nextInt();
        next=null;
    }
}

public class LinkedList {

    public static Node_ create(Node_ start){
        Node_ newNode=new Node_();
        start=newNode;
        Node_ temp=start;
        while (true) {
            Scanner sc =new Scanner(System.in);
            System.out.println("Do you want to add more node(Y/N):");
            char c= sc.next().charAt(0);
            if(c=='n'||c=='N'){
                break;
            }
            Node_ newn=new Node_();
            temp.next=newn;
            temp=newn;
        }
        return start;
    }

    public static void Display(Node_ start){
        Node_ temp=start;
        System.out.print("List elements are: ");
        while (temp!=null) {
            System.out.print(temp.data+"->");   
            temp=temp.next;         
        }
        System.out.println("null");
    }

    public static int count(Node_ start){
        int c=0;
        Node_ temp=start;
        while (temp!=null) {
            c++;
            temp=temp.next;
        }
        return c;
    }

    public static void search(Node_ start) {
		if(start==null)
		{
			System.out.println("Empty linked list");
			System.exit(0);
		}
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter data which you need to update: ");
	    int key = sc.nextInt();
	    
	    Node_ temp = start;
	    
	    // Use && instead of || to prevent NullPointerException
	    while (temp != null && temp.data != key) {
	        temp = temp.next;
	    }

	    if (temp != null) {
	        System.out.println("Enter new data: ");
	        int m = sc.nextInt();
	        temp.data = m;
	        System.out.println("Successfully updated");
	    } else {
	        System.out.println("Error! Data not found");
	    }
	}
	
    public static Node_ InsBeg(Node_ start){
        if (start==null) {
            System.out.println("Empty Linked List");
            System.exit(0);
        }
        Node_ newn=new Node_();
        newn.next=start;
        start=newn;
        System.out.println("Successfully Inserted");
        return start;
    }

    public static Node_ InsEnd(Node_ start){
        if (start==null) {
            System.out.println("Empty Linked List");
            System.exit(0);
        }
        Node_ newnode=new Node_();
        Node_ temp=start;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        System.out.println("Successfully Inserted");
        return start;
    }

    public static Node_ InsAnyPos(Node_ start){
        if(start==null){
            System.out.println("Empty Linked List");
            System.exit(0);
        }
        Node_ temp=start;
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter position of new node: ");
		int pos = sc.nextInt();
        if(pos==1){
            start=InsBeg(start);
            return start;
        }
        Node_ newnode = new Node_();
        for(int i=1;i<pos-1;i++){
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next=newnode;
        System.out.println("Successfully Inserted");
        return start;
    }

    public static Node_ DelBeg(Node_ start){
        if(start==null){
            System.out.println("Empty Linked List");
            System.exit(0);
        }
        start=start.next;
        System.out.println("Successfully deleted");
        return start;
    }

    public static Node_ DelEnd(Node_ start){
        if(start==null){
            System.out.println("Empty Linked List");
            return start;
        }
        Node_ temp=start;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        System.out.println("Successfully deleted");
        return start;
    }

    public static Node_ DelAny(Node_ start){
        if(start==null){
            System.out.println("Empty Linked List");
            return start;
        }
        Node_ temp = start;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter position of node to be deleted: ");
		int pos = sc.nextInt();
		
		for(int i = 1; i < pos-1; i++)
		{
			temp = temp.next;
		}
		temp.next = temp.next.next;
		System.out.println("Successfully deleted");
		return start;
    }

    public static Node_ sort(Node_ start){
        if(start==null)
		{
			System.out.println("Empty linked list");
			System.exit(0);
		}
        boolean swapped;
        do{
            swapped=false;
            Node_ temp=start.next;
            Node_ prev=start;
            while(temp!=null){
                if(prev.data>temp.data){
                   int d=prev.data;
                   prev.data=temp.data;
                   temp.data=d;
                   swapped=true;
                }
                prev=temp;
                temp=temp.next;
            }
        }while(swapped);
        System.out.println("Successfully sorted");
        return start;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		Node_ start = null;
		
		while(true) {
		    System.out.println("\n****MENU*****");
		    System.out.println("0: Exit");
		    System.out.println("1: Creation");
		    System.out.println("2: Display");
		    System.out.println("3: Insert at beginning");
		    System.out.println("4: Insert at end");
		    System.out.println("5: Insert at any position");
		    System.out.println("6: Delete at beginning");
		    System.out.println("7: Delete at end");
		    System.out.println("8: Delete at any position");
		    System.out.println("9: Count no. of nodes");
		    System.out.println("10: Sort the list");
		    System.out.println("11: Search the list");
		    System.out.println("Enter the choice: ");
            int choice = sc.nextInt();
		    
		    switch(choice) {
		        case 0:
		            System.exit(0);
		        
		        case 1:
		            start = create(start);
		            break;
		        
		        case 2:
		            Display(start);
		            break;
		        
		        case 3:
		            start = InsBeg(start);
		            break;
		        
		        case 4:
		            start = InsEnd(start);
		            break;
		        
		        case 5:
		            start = InsAnyPos(start);
		            break;
		        
		        case 6:
		            start = DelBeg(start);
		            break;
		        
		        case 7:
		            start = DelEnd(start);
		            break;
		        
		        case 8:
		            start = DelAny(start);
		            break;
		        
		        case 9:
		            int c = count(start);
		            System.out.println("Total number of nodes: " + c);
		            break;
		        
		        case 10:
		            start = sort(start);
		            break;
		        
		        case 11:
		            search(start);
		            break;
		        
		        default:
		            System.out.println("Wrong choice");
		            break;
		    }
		}
        
    }
}
