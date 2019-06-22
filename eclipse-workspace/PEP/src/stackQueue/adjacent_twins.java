package stackQueue;

import java.util.*;

public class adjacent_twins {
	 public static void removeAdjTwins(String s) {
		 Stack<Character> st = new Stack<Character>();
		 for(int i=0;i<s.length();i++)
		 {	char a = s.charAt(i);
			 if(st.empty())
				 st.push(a);
			 else if(st.peek()==a)
					 st.pop();
			 else
				 st.push(a);
		 }
		 StringBuilder input1 = new StringBuilder(); 
		 while(!st.empty())
		 {
			 
			  
		        
		  
		        // append a string into StringBuilder input1 
		        input1.append(st.pop()); 
		  
		        // reverse StringBuilder input1 
		        
		 }
		 input1 = input1.reverse(); 
		  
	        // print reversed String 
	        System.out.println(input1);
	 }

	 //Dont make changes here
	 public static void main(String[] args) {
	 	 // TODO Auto-generated method stub
	 	 Scanner sc=new Scanner(System.in);
	 	 String s = sc.next();
	 	 removeAdjTwins(s);
	 }

}