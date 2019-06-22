package stackQueue;

import java.util.Scanner;

public class stack_using_linked_list {
	 /*
	  The structure of the node of the stack is
	  class StackNode
	  {
	  	  int data;
	  	  StackNode next;
	      StackNode(int a)
	      {
	         data = a;
	         next = null;
	      }
	  }
	  */
	  static class MyStack {
	     // Note that top is by default null
	     // in Java
	       StackNode top,head;
	     public MyStack()
	     {
	         this.top = null;
	         this.head = null;
	     }
	  // Comlete the functions
	     void push(int a) 
	     {
	    	 StackNode nn = new StackNode(a);
	    	 nn.next = top;
	    	 top = nn;
	     }
	     
	     int pop() 
	     {
	    	 if(top==null)
	    	 {
	    		 return -1;
	    	 }
	    	 else
	    	 {
	    		 int data = top.data;
	    		 top = top.next;
	    		 return data;
	    		 
	    	 }
	    	 
	     }
	     
	  }
	   
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  // Dont make changes here  
	     public static void main(String[] args){
	  	  	  MyStack stack=new MyStack();
	  	    	   Scanner sc=new Scanner(System.in);
	  	    	   int n=sc.nextInt();
	  	    	   int i=0;// number of operationsto be performed
	  	    	   while(i!=n){
	  	    	  	   int q=sc.nextInt();
	  	    	  	   if(q==1){
	  	    	  	  	  stack.push(sc.nextInt());
	  	    	  	   }
	  	    	  	   else if(q==2)System.out.println( stack.pop());
	  	    	  	   i++;
	  	    	   }
	  	     }
	     
	     
	     static class StackNode
	     {
	     	  int data;
	     	  StackNode next;
	         StackNode(int a)
	         {
	            data = a;
	            next = null;
	         }
	     }
}
