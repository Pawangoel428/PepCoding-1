package ArraysString;

import java.util.Scanner;

public class shortest_and_unsorted_continuous_subarray {

	 public static int findUnsortedSubarray(int[] a) {
 	 	 // write your code here.
		
		 int min[] = new int[a.length];
		 int max[] = new int[a.length];
		 max[0] = a[0];
		 min[a.length-1] = a[a.length-1];
		 for(int i=1;i<a.length;i++)
			 max[i] = Integer.max(max[i-1], a[i]);
		 for(int i = a.length-2;i>=0;i--)
			 min[i] = Integer.min(min[i+1], a[i]);
		 int i = 0,j = a.length-1;
		 while(i<a.length&&max[i]==min[i])
			 i++;
		 while(j>=0&&min[j]==max[j])
			 j--;
		 if(i<j)
		 return j-i+1;
		 else
			 return 0;
 	 }
 
 	 public static void main(String[] args) {
 	 	 Scanner sc = new Scanner(System.in);
 
 	 	 // Input for length of array.
 	 	 int length = sc.nextInt();
 
 	 	 int[] arr = new int[length];
 
 	 	 // Input for elements of array.
 	 	 for (int i = 0; i < arr.length; i++) {
 	 	 	 arr[i] = sc.nextInt();
 	 	 }
 
 	 	 System.out.println(findUnsortedSubarray(arr));
 
 	 }
 
 	 // function to display an array.
 	 public static void display(int[] arr) {
 
 	 	 for (int i = 0; i < arr.length; i++) {
 	 	 	 System.out.print(arr[i] + " ");
 	 	 }
 
 	 	 System.out.println();
 	 }
}
