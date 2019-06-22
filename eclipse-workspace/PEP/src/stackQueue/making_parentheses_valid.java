package stackQueue;

import java.util.*;

public class making_parentheses_valid {
	public static int minAddToMakeValid(String S) {
        //Write your code here
		Stack<Character> st = new Stack<Character>();
		for(int i=0;i<S.length();i++)
		{
			if(st.isEmpty())
				st.push(S.charAt(i));
			else if(S.charAt(i)==')'&&st.peek()=='(')
				st.pop();
			else
				st.push(S.charAt(i));
		}
		
		return st.size();
    }

    // Dont make changes here
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(minAddToMakeValid(s));
    }
}
