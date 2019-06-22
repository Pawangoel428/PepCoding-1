package stackQueue;

import java.util.*;
public class next_greater_node {
	 /* Structure of ListNode
	 	 ListNode {
	 	       int val;
	 	       ListNode next;
	 	       ListNode(int x) { val = x; }
	 	   }
	 */
	 public static int[] nextLargerNodes(ListNode head,int size) {
		 if (head == null) return null;
	 	 int count = 1;
	 	 ListNode current = head;
	 	 while(current.next != null){
	 	 count++;
	 	 current = current.next;
	 	 }
	 	 int[] ans = new int[count];
	 	 ListNode curr = head, temp = curr.next;
	 	 for (int i = 0; i< count; i++){
	 	 while (temp != null && temp.val <= curr.val)
	 	     temp = temp.next;
	 	 if (temp != null) 
	 	     ans[i] = temp.val;
	 	 curr = curr.next;
	 	 if(curr != null) 
	 	     temp = curr.next;
	 	 }
	 	 return ans;  
	 	 }
	 
	 // Dont make changes here
	 public static void main(String[] args) {
	 	 // TODO Auto-generated method stub
	 	 Scanner sc = new Scanner(System.in);
	 	 int size=sc.nextInt();
	 	 int headval=sc.nextInt();
	 	 ListNode head=new ListNode(headval);
	 	 ListNode tail=head;
	 	 for(int i=1;i<size;i++){
	 	 	 ListNode curr=new ListNode(sc.nextInt());
	 	 	 tail.next=curr;
	 	 	 tail=curr;
	 	 }
	 	 int[] res=nextLargerNodes(head,size);
	 	 for(int i=0;i<size;i++)System.out.print(res[i]+" ");
	 }
	 static class ListNode {
	       int val;
	       ListNode next;
	       ListNode(int x) { val = x; }
	   }

}