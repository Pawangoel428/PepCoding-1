package stackQueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class valid_braces {
	
	public static void isbal(String S){
	     // Write your code here
		Object open[] = {'(','{','['};
		Object close[] = {')','}',']'};
		Stack<Character> st = new Stack<Character>();
		for(int i=0;i<S.length();i++)
		{
			if(st.isEmpty())
				st.push(S.charAt(i));
//			else if(Arrays.binarySearch(open, S.charAt(i))!=-1&&Arrays.binarySearch(open, st.peek())!=-1)
//				st.pop();
			else if(S.charAt(i)==')'&&st.peek()=='(')
				st.pop();
			else if(S.charAt(i)=='}'&&st.peek()=='{') 
				st.pop();
			else if(S.charAt(i)==']'&&st.peek()=='[')
				st.pop();
			else
				st.push(S.charAt(i));
		}
		
		System.out.println(st.isEmpty()?"balanced":"not balanced");
	     }

	 
	 	 //Dont make changes here
	 	 public static void main (String[] args) {
	 	 	 Scanner scn=new Scanner(System.in);
	 	  	 String s=scn.next();
	 	  	 isbal(s);
	 	 
	 	 }
}
