package HashMapHeap;

import java.util.*;

public class find_the_odd_occurrence {

	  public static int solve(int[] arr) {
	         // write your code here.
	         int sum=arr[0];
	         for(int i=1;i<arr.length;i++)
	         {
	        	 sum= sum^arr[i];
	        	 //System.out.println(sum);
	         }
		  
		  return sum;
	     }
	 
	     public static void main(String[] args) {
	 
	         Scanner sc = new Scanner(System.in);
	         int N = sc.nextInt();
	         int[] arr = new int[N];
	 
	         for (int i = 0; i < N; i++) {
	             arr[i] = sc.nextInt();
	         }
	 
	         System.out.println(solve(arr));
	 
	     }
}
