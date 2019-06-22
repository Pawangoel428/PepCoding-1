package stackQueue;

import java.util.Scanner;


public class queue_using_linkedlist {

	 static class QueueNode
	 {
	 	 int data;
	 	 QueueNode next;
	 	 QueueNode(int a)
	 	 {
	 	     data = a;
	 	     next = null;
	 	 }
	 }
	static class MyQueue
	 {
	     QueueNode front, rear;
	 
	     // This function should add an item at
	 
	     // rear
	 	 void push(int a)
	 	 {
	 		 QueueNode t = new QueueNode(a);
	 		 if(front==null||rear==null)
	 		 {front = t;rear = t;}
	 		 else
	 		 {
	 			 t.next = rear;
	 			 rear = t;
	 		 }
	 	 }
	 	 
	     // This function should remove front
	     // item from queue and should return
	     // the removed item.
	 	 int pop()
	 	 {
	 		if(front==null)
	 			return -1;
	 		else if(front==rear)
	 		{front = null;rear=null;return -1;}
	 		else
	 		{ QueueNode n= rear;
	 			while(n.next!=front)
	 				n = n.next;
	 			n.next=null;
	 			int num = front.data;
	 			front = n;
	 			return num;
	 		}
	 	 }
	 }
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 MyQueue qs=new MyQueue();
	        int Q=sc.nextInt();
	        for(int i=0;i<Q;i++){
	            int q=sc.nextInt();
	            if(q==1){
	                qs.push(sc.nextInt());
	            }
	            else if(q==2){
	                System.out.println(qs.pop());
	            }
	            
	        }
		
	}
	 
}
