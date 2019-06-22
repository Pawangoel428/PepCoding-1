package stackQueue;

import java.util.*;

public class number_of_reversals {

  	 public static int min_str_reversal(String s){
  		 if(s.length()%2!=0)
  			 return-1;
  		 float counto = 0,countc = 0;
  		 Stack<Character> st = new Stack<Character>();
  		 for(int i=0;i<s.length();i++)
  		 {
  			 if(s.charAt(i)=='{')
  				 st.push('{');
  			 else if(s.charAt(i)=='}')
  			 {
  				 if(st.isEmpty()||st.peek()=='}')
  					 st.push('}');
  				 else 
  					 st.pop();
  			 }
  		 }
  		 while(!st.isEmpty())
  		 {
  			 if(st.pop()=='{') counto++;
  			 else countc++;
  		 }
  		 System.out.println(countc+" "+counto);
  		 int count = (int) (Math.ceil(counto/2)+Math.ceil(countc/2));
  		 return count;
	 }




	 // Dont make changes here
	 public static void main (String[] args) {
	     Scanner scn=new Scanner(System.in);
	     String s=scn.next();
	     System.out.println(min_str_reversal(s));
	     
	 }
}
