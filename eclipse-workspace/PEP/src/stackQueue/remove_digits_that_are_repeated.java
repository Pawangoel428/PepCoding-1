package stackQueue;

import java.util.*;

public class remove_digits_that_are_repeated {

	 static void removeRep(long n) 
	 {
           Stack<Integer> st = new Stack<Integer>();
           int rem = 0;
           long qou = n;
           
           do{
        	   rem = (int) (qou%10);
        	   qou = qou/10;
        	   if(st.isEmpty())
        		   st.push(rem);
        	   else if(st.peek()!=rem)
        		   {st.push(rem);}
           }while(qou!=0);
        	   
        	   while(!st.isEmpty()) {
        		   System.out.print(st.pop());
        	   }
           
	 } 
	  



        // Dont make changes here
        public static void main (String[] args) {
	 
            Scanner sc=new Scanner(System.in);
            long A=sc.nextLong();
            removeRep(A);
	 
        }	 
}
