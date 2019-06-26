package HashMapHeap2;

import java.util.Scanner;

public class count_of_substrings_containing_k_ones {

	  public static void main (String[] args) 
	     { 
	         Scanner scn = new Scanner(System.in);
	         String s = scn.next(); 
	         int K = scn.nextInt(); 
	           
	         System.out.println( 
	             countOfSubstringWithKOnes(s, K)); 
	     } 
	     // -----------------------------------------------------
	 	 // This is a functional problem. Only this function has to be written.
	 	 // This function takes as input a string and an integer k.
	 	 // It should return required integer value.
	 
	     static int countOfSubstringWithKOnes(String s, int K) 
	     { 
	 	 	 //Write your code here
	         int N = s.length(); 
	         int res = 0; 
	         int countOfOne = 0; 
	         int []freq = new int[N+1]; 
	       
	        
	         freq[0] = 1; 
	       
	         
	         for (int i = 0; i < N; i++) { 
	       
	             
	             countOfOne += (s.charAt(i) - '0'); 
	       
	             
	             if (countOfOne >= K) { 
	       
	                 
	                 res += freq[countOfOne - K]; 
	             } 
	       
	            
	             freq[countOfOne]++; 
	         } 
	           
	         return res; 
	     } 
}
