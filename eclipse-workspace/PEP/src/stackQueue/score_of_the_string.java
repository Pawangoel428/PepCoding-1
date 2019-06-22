package stackQueue;

import java.util.*;

public class score_of_the_string {
	 
    public static int scoreOfParentheses(String s) {
    	int score = 0;
    	
    	Stack<Character> st = new Stack<Character>();
    	for(int i=0;i<s.length();i++)
    	{
    		if(s.isEmpty())
    			st.push(s.charAt(i));
    		else if(s.charAt(i)==')'&&st.peek()=='(')//||Character.isDigit(st.peek())))
    		{
    			st.pop();//for '('
    			st.push('1');
    			
    		}
    		else if(s.charAt(i)==')'&&Character.isDigit(st.peek()))
    		{
    			int temp = Integer.parseInt(st.pop()+"");
    			while(Character.isDigit(st.peek()))
    					{
    						temp += Integer.parseInt(st.pop()+"");
    					}
    			st.pop();//for'('
    			st.push(Integer.toString(2*temp).charAt(0));
    		}
    		else
    			st.push(s.charAt(i));
    		//System.out.println( s.charAt(i)+" "+st.peek());
    			
    	}
    	while(!st.isEmpty())
    	{
    		score += Integer.parseInt(st.pop()+"");
    	}
    	return score;
     }
     
     
 
 
 
 
 
 
 
 
     // Dont make changes here
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         String s=sc.next();
         System.out.println(scoreOfParentheses(s));
     }
     
}
