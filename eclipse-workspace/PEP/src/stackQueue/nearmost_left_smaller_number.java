package stackQueue;

import java.util.*;

public class nearmost_left_smaller_number {

	
	static void printNearmostLeftSmaller(int arr[], int n) { 
	 	 // Write your code here
		Stack<Integer> S = new Stack<Integer>();
		
		for(int i=0;i<n;i++)
		{
			// element is greater than or equal to arr[i] 
	 	 	 while (!S.empty() && S.peek() >= arr[i]) { 
	 	 	 	 S.pop(); 
	 	 	 } 

	 	 	 // If all elements in S were greater than arr[i] 
	 	 	 if (S.empty()) { 
	 	 	 	 System.out.print("-1 "); 
	 	 	 } else //Else print the nearest smaller element 
	 	 	 { 
	 	 	 	 System.out.print(S.peek() + " "); 
	 	 	 } 

	 	 	 // Push this element 
	 	 	 S.push(arr[i]); 
			
		}
	 	 } 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 	 //Dont make changes here
	 	 public static void main(String[] args) { 
	             Scanner sc=new Scanner(System.in);
	             int n=sc.nextInt();
	             int arr[] = new int[n]; 
	             for(int i=0;i<n;i++)arr[i]=sc.nextInt();
	 	 	 printNearmostLeftSmaller(arr, n); 
	 	 } 
}
