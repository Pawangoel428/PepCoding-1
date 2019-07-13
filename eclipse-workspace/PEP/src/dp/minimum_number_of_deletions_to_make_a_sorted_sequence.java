package dp;

import java.util.Scanner;

public class minimum_number_of_deletions_to_make_a_sorted_sequence {

	 public static void main(String[] args) {
 	 	 Scanner scn = new Scanner(System.in);
 	 	 	 int n = scn.nextInt();
 	 	 	 int a[] = new int[n];
 	 	 	 for (int i = 0; i < n; i++)
 	 	 	 	 a[i] = scn.nextInt();
 	 	 	 mindeletions(a, n);
 	 }
 	 
 	 // -----------------------------------------------------
 	 // This is a functional problem. Only this function has to be written.
 	 // This function takes as input an array and its length
 	 // It should print the required output
 
     public static void mindeletions(int[] arr, int n)
 	 {
    	 int result = 0; 
         int[] lis = new int[n]; 

         for (int i = 0; i < n; i++ ) 
             lis[i] = 1; 

         for (int i = 1; i < n; i++ ) 
             for (int j = 0; j < i; j++ ) 
                 if ( arr[i] > arr[j] && 
                     lis[i] < lis[j] + 1) 
                     lis[i] = lis[j] + 1; 

         for (int i = 0; i < n; i++ ) 
             if (result < lis[i]) 
                 result = lis[i]; 
       
    	 System.out.println(result);
 	 }
}
