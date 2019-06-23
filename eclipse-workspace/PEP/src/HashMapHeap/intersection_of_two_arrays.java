package HashMapHeap;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class intersection_of_two_arrays {

	public static void main (String[] args) throws IOException
	  {
	 	     Scanner scn= new Scanner(System.in);
	 	     int n = scn.nextInt();
	 	 	 int[] num = new int[n];
	 	 	 for (int i = 0; i < n; i++) {
	 	 	 	 num[i] = scn.nextInt();
	 	 	 }
	 	 	 int m = scn.nextInt();
	 	 	 int[] num2 = new int[m];
	 	 	 for (int i = 0; i < m; i++) {
	 	 	 	 num2[i] = scn.nextInt();
	 	 	 }
	 	 	 
	 	 	     solve(n,m,num,num2);
	  }
	  // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input two arrays and their lengths 
	 // Print required output
	  public static void solve(int m,int n,int[] nums1,int[] nums2){
	      //Write your code here
		  HashSet<Integer> hs = new HashSet<Integer>();
		  for(int i=0;i<nums1.length;i++)
		  {
			  hs.add(nums1[i]);
		  }
		  int count =0;
		  for(int i=0;i<nums2.length;i++)
		  {
			  if(hs.contains(nums2[i]))
			  {
				count++;
				hs.remove(nums2[i]);
			  }
		  }
		  System.out.println(count);
		  
	  }
}
