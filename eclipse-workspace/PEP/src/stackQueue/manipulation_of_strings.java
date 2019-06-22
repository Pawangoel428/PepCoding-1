package stackQueue;

import java.util.*;

public class manipulation_of_strings {

	 public static int stringManipulation(String[] S){
	 /// Write your code here
		 Stack<String> st = new Stack<String>();
		 for(int i=0;i<S.length;i++)
		 {
			 if(st.isEmpty())
				 st.push(S[i]);
			 else if(st.peek().equals(S[i]))
				 st.pop();
			 else
				 st.push(S[i]);
			 
		 }
		
		 return st.size();
	 }






	 // Dont make changes here
        public static void main (String[] args) {
	 	 Scanner sc=new Scanner(System.in);
	 	     int l=sc.nextInt();
	 	     String[] S=new String[l];
	 	     for(int i=0;i<S.length;i++)
	 	         S[i]=sc.next();
	 	     System.out.println(stringManipulation(S));
	 }
}
