package test2;

import java.util.Scanner;
import java.util.Stack;

public class next_smaller_element {

	static void printNearmostLeftSmaller(int arr[], int n) { 
	 	 // Write your code here
		Stack<Integer> S = new Stack<Integer>();
		int a[] = new int[n];
		for(int i=n-1;i>=0;i--)
		{
			// element is greater than or equal to arr[i] 
	 	 	 while (!S.empty() && S.peek()>= arr[i]) { 
	 	 	 	 S.pop(); 
	 	 	 } 

	 	 	 // If all elements in S were greater than arr[i] 
	 	 	 if (S.empty()) { 
	 	 	 	 a[i]= -1; 
	 	 	 } else //Else print the nearest smaller element 
	 	 	 { 
	 	 	 	 a[i]= S.peek(); 
	 	 	 } 

	 	 	 // Push this element 
	 	 	 S.push(arr[i]); 
			
		}
		for(int i= 0;i<n;i++)
			System.out.println(a[i]);
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
