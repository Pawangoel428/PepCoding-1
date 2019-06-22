package stackQueue;

import java.util.*;

public class stack_validation {
	public static boolean validateStackSequences(int[] pushed, int[] popped) {
	     // Write your code here
		Stack<Integer> st = new Stack<Integer>();
		int j=0,i=0;
		while(i<pushed.length)
		{
			if(pushed[i]==popped[j])
			{
				i++;j++;
				while(!st.isEmpty()&&st.peek()==popped[j])
				{
					j++;st.pop();
				}
			}
			else
				{st.push(pushed[i]);i++;}
		}
		while(!st.isEmpty())
		{
			if(popped[j]!=st.pop())
				return false;
			j++;
		}
		return true;
	     }
	     //Dont make changes here
	     public static void main(String[] args){
	         Scanner sc=new Scanner(System.in);
	         int N = sc.nextInt();
	         int[] pushed=new int[N];
	         int[] popped=new int[N];
	         for(int i=0;i<N;i++)pushed[i]=sc.nextInt();
	         for(int i=0;i<N;i++)popped[i]=sc.nextInt();
	         System.out.print(validateStackSequences(pushed, popped));
	     }
}
