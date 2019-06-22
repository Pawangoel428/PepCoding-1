package stackQueue;

import java.util.*;

public class consecutive_pairs_in_an_array {
	public static boolean pairWiseConsecutive(Stack<Integer> st) {
	 	 // Write your code here
		int count = 0;
			while(!st.isEmpty())
			{int temp1 = st.pop();
			 if(st.empty())
				 return true;
			 else if(Math.abs(temp1-st.pop())!=1)
						return false;
			}
		
		return true;
	 	}
	 	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 	 // Dont make changes here
	 	 public static void main(String[] args){
	 	 	 Scanner sc=new Scanner(System.in);
	 	 	 int n=sc.nextInt();
	 	 	 Stack<Integer>st=new Stack<>();
	 	 	 for(int i=0;i<n;i++){
	 	 	 	 st.push(sc.nextInt());
	 	 	 }
	 	 	 System.out.println(pairWiseConsecutive(st));
	 	 	 	 
	 	 }
}
