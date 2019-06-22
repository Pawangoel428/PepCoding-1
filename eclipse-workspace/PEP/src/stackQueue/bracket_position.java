package stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class bracket_position {

    public static void printBracketsPos(String s){
        Stack<Integer> st = new Stack<Integer>();
        int count = 0;
        for(int i=0;i<s.length();i++)
        {
        	if(s.charAt(i)=='(')
        	{
        		count++;
        		st.push(count);
        		System.out.print(count+" ");
        	}
        	else if(!st.isEmpty()&&s.charAt(i)==')')
        		System.out.print(st.pop()+" ");

        }
        
	 }


	 //Dont make changes here 
	 public static void main (String[] args) {
	     Scanner scn=new Scanner(System.in);
	         String s=scn.next();
	         printBracketsPos(s);
	     
	 }
}
