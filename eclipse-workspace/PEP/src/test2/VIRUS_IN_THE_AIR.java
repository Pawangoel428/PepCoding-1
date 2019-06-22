package test2;

import java.util.*;

public class VIRUS_IN_THE_AIR {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		int n[] = new int[num];
		for(int i=0;i<num;i++)
		{
			n[i] = sc.nextInt();
		}
		System.out.println(VirusDaySpread(n));
	}

	private static int VirusDaySpread(int[] arr) {
		// TODO Auto-generated method stub
		 // Write your code here
		Stack<Integer> S = new Stack<Integer>();
		int n = arr.length;
		int max = 0;
		for(int i=0;i<n-1;i++)
		{
			int count = 0;
			// element is greater than or equal to arr[i] 
	 	 	 while (!S.empty() && S.peek()<= arr[i]) { 
	 	 	 	 S.pop(); 
	 	 	 	 count++;
	 	 	 } 
	 	 	 if(max<count) max=count;
	 	 	 // If all elements in S were greater than arr[i] 
	 	 	 else if (!S.empty()) //Else print the nearest smaller element 
	 	 	 { 
	 	 	 	S.peek();
	 	 	 } 

	 	 	 // Push this element 
	 	 	 S.push(arr[i]); 
			
		}
		
		return max;
	}
}
