package test2;

import java.util.*;

import stackQueue.long_parenthesis.node;

public class Parentheses_subsequence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str = sc.next();
		System.out.println(unbalancedParenthsis(str));
	}

	private static int unbalancedParenthsis(String str) {
		// TODO Auto-generated method stub
		if(str == null) return 0;
		Stack<Character> st = new Stack<Character>();
		int count = 0;
		for(int i = 0;i<str.length();i++)
		{
			if(st.isEmpty())
			{st.push(str.charAt(i));}
		else if(str.charAt(i)=='(')
			{st.push(str.charAt(i));}
		else if(str.charAt(i)==')')
		{
			if(!st.isEmpty()&&st.peek()=='(')
			{
				st.pop();
			}
			else if (st.peek()==')')
			{
				st.push(str.charAt(i));
			}
		}
		}
		if(str.length()%2==0&&st.isEmpty()) return str.length()-1;
		else if(str.length()%2==0 &&!st.isEmpty()) return str.length();
		else return str.length();
		
	}
}
