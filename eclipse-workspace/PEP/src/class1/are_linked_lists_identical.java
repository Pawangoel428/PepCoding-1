package class1;

import java.util.Scanner;

public class are_linked_lists_identical {

	  public static boolean isIdentical(Node h1, Node h2) {
	         // write your code here and return true if they are identical, otherwise
	         // false
		  while(h1!=null&&h2!=null)
		  {
			  if(h1.data!=h2.data)
				  return false;
			  h1 = h1.next;
			  h2 = h2.next;
		  }
		  
		  return true;
	     }
	 
	     // -----------------------------------------------------
	 
	     public static void main(String[] args) {
	         Scanner sc = new Scanner(System.in);
	         int n1 = sc.nextInt();
	         int a1 = sc.nextInt();
	         head = insert(head, a1);
	 
	         for (int i = 1; i < n1; i++) {
	             int a = sc.nextInt();
	             head = insert(head, a);
	         }
	 
	         int n2 = sc.nextInt();
	         int a2 = sc.nextInt();
	         head2 = insert(head2, a2);
	 
	         for (int i = 1; i < n2; i++) {
	             int a = sc.nextInt();
	             head2 = insert(head2, a);
	         }
	 
	         if(isIdentical(head, head2)){
	             System.out.println("Identical");
	         }else{
	             System.out.println("Not Identical");
	         }
	 
	     }
	 
	     // Class declaration for a Node of the Linked List
	     static class Node {
	         int data;
	         Node next;
	 
	         public Node(int data) {
	             this.data = data;
	             this.next = null;
	         }
	 
	     }
	 
	     static Node head;
	 
	     static Node head2;
	 
	     static Node head3;
	 
	     /*
	      * Input Parameters: head: head of the linked list in which a new node is to
	      * be inserted. data: the data value of the node which is to be inserted.
	      * 
	      * Return Value: head of the linked list in which the node is inserted
	      */
	     public static Node insert(Node head, int data) {
	 
	         if (head == null) {
	             return new Node(data);
	         }
	 
	         head.next = insert(head.next, data);
	         return head;
	     }
	 
	     /*
	      * Input Parameters: head: head of the linked list in which is to be
	      * displayed.
	      * 
	      * Return Value: null
	      */
	     public static void display(Node head) {
	         for (Node node = head; node != null; node = node.next) {
	             System.out.print(node.data + " ");
	         }
	     }
	 
}
