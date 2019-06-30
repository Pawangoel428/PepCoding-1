package class1;

import java.util.PriorityQueue;
import java.util.Scanner;

public class merge_multiple_sorted_linked_lists {

	 public static Node mergeKList(Node []lists, int k){
         // write your code here.
		 
	      PriorityQueue<Node> minHeap = new PriorityQueue<>((n1, n2) -> n1.data - n2.data);
	        
	        for(Node node : lists) {
	            while (node != null) {
	                minHeap.offer(new Node(node.data));
	                node = node.next;
	            }
	        }
	        
	        Node curr = !minHeap.isEmpty() ? minHeap.poll() : null;
	        Node head = curr;
	        while(!minHeap.isEmpty()) { 
	            curr.next = minHeap.poll();
	            curr = curr.next;
	        }
	        
	        return head;
		
	}
     // -----------------------------------------------------
     
 
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int k = sc.nextInt();
         
         Node[] arr = new Node[k];
         
         Node start = null;
         Node curr = null;
         
         for(int i=0; i < k; i++){
             int n = sc.nextInt();
             int a = sc.nextInt();
             start = new Node(a);
             arr[i] = start;
             
             curr = start;
             for(int j = 1; j < n; j++){
                 Node ptr = new Node(sc.nextInt());
                 curr.next = ptr;
                 curr = ptr;
             }
             curr.next = null;
             start = null;
         }
         
         Node res = mergeKList(arr, k);
         display(res);
         
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
