package stackQueue;

import java.util.Scanner;

public class stack_using_array {

	 static class MyStack{
	     int top;
	 	 int arr[] = new int[1000];
	     MyStack()
	 	 {
	 	 	 top = -1;
	 	 }
	 	 
	 	 /* The method push to push element
	 	     into the stack */
	     void push(int a)
	 	 {
	    	 top++;
	    	 arr[top] = a; 
	     } 
	 	 
	     /* The method pop which return 
	       the element poped out of the stack*/
	 	 int pop()
	 	 {
	 		 if(top==-1)
	 			 return -1;
	 		 int t = arr[top];
	 		 top--;
	 		 return t;
	         
	 		 // Your code here
	         }
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 	 // Dont make changes here
	 	 public static void main(String args[])
	 	 {
	             Scanner sc = new Scanner(System.in);
	             MyStack obj = new MyStack();
	             int Q = sc.nextInt();
	                 while(Q>0)
	 	 	 {
	                     int QueryType = 0;
	                     QueryType = sc.nextInt();
	                     if(QueryType == 1)
	                     {
	                         int a = sc.nextInt();
	 	 	 	 	 	 
	 	 	 	 obj.push(a);
	 	 	 	 	 	 
	                     }else if(QueryType == 2)
	 	 	 	 {
	                             System.out.print(obj.pop()+" ");
	 	 	 	 }
	                     Q--;
	 	 	 }
	 	 }
}
