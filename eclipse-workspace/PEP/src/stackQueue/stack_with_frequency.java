package stackQueue;

import java.util.*;

public class stack_with_frequency {

	private static class FreqStack {
	      // Write your code
		static HashMap<Integer, Integer> st1 = new HashMap<Integer, Integer>();
		static HashMap<Integer, Stack<Integer>> st2 = new HashMap<Integer, Stack<Integer>>();
		static int maxfreq = 0;
	      public FreqStack() {
	      }
	  
	      public static void push(int x) {
	    	  int f = st1.getOrDefault(x, 0) + 1;
	          st1.put(x, f);
	          if (f > maxfreq)
	              maxfreq = f;
	  
	          st2.computeIfAbsent(f, z-> new Stack()).push(x);
	      }
	  
	      public static int pop() {
	          int x = st2.get(maxfreq).pop();
	          st1.put(x, st1.get(x) - 1);
	          if (st2.get(maxfreq).size() == 0)
	              maxfreq--;
	          return x;
	      }
	  
	  }
	       
	  
	  
	  
	  
	  
	  
	  	  //Dont make changes here
	  	  public static void main(String[] args){
	      	   FreqStack fq=new FreqStack();
	      	   Scanner sc=new Scanner(System.in);
	      	   int n=sc.nextInt();
	      	   int i=0;
	      	   while(i!=n){
	      	  	   int q=sc.nextInt();
	      	  	   if(q==1){
	  	  	  	  i++;
	      	  	  	   fq.push(sc.nextInt());
	      	  	   }
	      	  	   else if(q==2)System.out.println( fq.pop());
	      	  	   i++;
	      	   }
	       	  }
	      
}
