package stackQueue;

import java.util.*;

public class sorted_stack {

	public static Stack<Integer> sortstack(Stack<Integer> input) 
{ 
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();
		while(!input.isEmpty())
		{
			if(s1.isEmpty())
				s1.push(input.pop());
			else{
				while(!s1.isEmpty()&&!input.isEmpty()&&s1.peek()>input.peek())
					s2.push(s1.pop());
				s1.push(input.pop());
				while(!s2.isEmpty())
					s1.push(s2.pop());
			}
		}
		return s1;
} 



		// Dont make changes here 
		public static void main(String args[]) 
		{ 
		Stack<Integer> input = new Stack<Integer>(); 
		Scanner sc=new Scanner(System.in); 
		int n=sc.nextInt();
		for(int i=0;i<n;i++)input.push(sc.nextInt());
		
		Stack<Integer> res=sortstack(input); 
		
		while (!res.empty()) 
		{ 
		System.out.print(res.pop()+" "); 
		} 
		} 
}
