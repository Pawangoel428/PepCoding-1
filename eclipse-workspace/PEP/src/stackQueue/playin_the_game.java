package stackQueue;

import java.util.*;

public class playin_the_game {
	  public static int calculatePoints(String[] ops) {
		 Stack<Integer> s = new Stack<Integer>();
		 int num1=0,num2=0; 
		 for(int i=0;i<ops.length;i++)
		 {
			 if(ops[i].charAt(0)=='-'||Character.isDigit(ops[i].charAt(0)))
		 	{
				 int num = Integer.parseInt(ops[i]);
				 s.push(num);
				 System.out.println(num);
		 	}
			 
			 else if(ops[i].charAt(0)=='C')
				 s.pop();
			 else if(ops[i].charAt(0)=='D')
			 {
				 int temp =s.peek();
				 s.push(temp*2);
			 }
			 else if(ops[i].charAt(0)=='+')
			 {
				 int temp1 = s.pop();
				 int temp2 = s.peek();
				 s.push(temp1);
				 s.push(temp1+temp2);
			 }
				 
		 }
		  int sum = 0 ;
		  while(!s.isEmpty())
		  {
			  sum+=s.pop();
		  }
		  return sum;
		 	 }
		 
		 
		 
		 	 
		 
		 	 //Dont make changes here
		 	 public static void main(String[] args) {
		 	 Scanner sc=new Scanner(System.in);
		 	 int n=sc.nextInt();
		 	 String[] S=new String[n];
		 	 for(int i=0;i<n;i++){
		 	 	 S[i]=sc.next();
		 	 }
		 	 System.out.println(calculatePoints(S));
		 	 }
}
