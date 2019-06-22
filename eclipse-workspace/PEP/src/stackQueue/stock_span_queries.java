package stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class stock_span_queries {
	 static class StockSpanner {
		 // Complete the functions
		 Stack<Integer> st = new Stack<Integer>();//price
		 Stack<Integer> st2 = new Stack<Integer>();//indexs
		     public StockSpanner() {
		    	 st = new Stack<Integer>(); 
		    	 st2 = new Stack<Integer>();
		     }
		 
		     public int next(int price) {
		    	 int w = 1;
		         while (!st.isEmpty() && st.peek() <= price) {
		             st.pop();
		             w += st2.pop();
		         }
		 
		         st.push(price);
		         st2.push(w);
		         return w;
		    	 
		     }
		     
		 
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 //Dont make chamnges here
		 	 public static void main(String[] args){
		 	 	 StockSpanner ss=new StockSpanner();
		 	 	 Scanner sc=new Scanner(System.in);
		 	 	 int n=sc.nextInt();
		 	 	 for(int i=0;i<n;i++){
		 	 	 	 System.out.println(ss.next(sc.nextInt()));
		 	 	 }
		 	 }
		 
}
