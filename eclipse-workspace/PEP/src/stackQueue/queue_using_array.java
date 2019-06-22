package stackQueue;

import java.util.Scanner;

public class queue_using_array {

	static class MyQueue {
	 	 static int front, rear;
	 	 static int arr[] = new int[1000];
	     	 
	 	 //constructor
	 	 MyQueue()
	 	 {
	 	 	 front=0;
	 
	 	 	 rear=0;
	 	 }
	 	 
	 	 /* The method push to push element
	 	    into the queue */
	 	 static void push(int a)
	 	 {
	 		 
	 		 arr[rear] = a;rear++;
	 	 } 
	     	 /* The method pop which return the 
	        	 element poped out of the queue*/
	 	 static int pop()
	 	 {
	 		 if(rear==front)
	 			 return -1;
	 		 else
	 		 { int num = arr[front]; front++; return num;}
	 		 
	 		 
	 	 } 
	 }
	 
	 
	 
	 
	 
	 // Dont make changes  here
	 public static void main(String[] args){
	 	 MyQueue queue=new MyQueue();
	   	  Scanner sc=new Scanner(System.in);
	   	  int n=sc.nextInt();
	   	  int i=0;// number of operationsto be performed
	   	  while(i!=n){
	   	 	  int q=sc.nextInt();
	   	 	  if(q==1){
	   	 	 	  queue.push(sc.nextInt());
	   	 	  }
	   	 	  else if(q==2)System.out.println( queue.pop());
	   	 	  i++;
	   	  }
	    }
	 
}
