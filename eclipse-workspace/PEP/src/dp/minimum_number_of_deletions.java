package dp;

import java.util.Scanner;

public class minimum_number_of_deletions {
	 public static void main(String[] args) {
 	 	 // TODO Auto-generated method stub
 	 	 Scanner scn = new Scanner(System.in);
             String str = scn.next();
             mindeletions(str);
     }
 	 
 	 // -----------------------------------------------------
 	 // This is a functional problem. Only this function has to be written.
 	 // This function takes as input a string
 	 // It should print the required output
 
     public static void mindeletions(String str){
 	 	 // Write your code here
    
    	 int lpsl = lps(str.toCharArray());
    	// System.out.println(lpsl);
    	 System.out.println(str.length()-lpsl);
 	 }

     static int lps(char str[]) { 
    	      
    	 int n = str.length; 
    	   int i, j, cl; 
    	   int L[][] = new int[n][n]; 
    	   for (i = 0; i < n; i++) 
    	      L[i][i] = 1; 
    	  
    	      for (cl=2; cl<=n; cl++) 
    	    { 
    	        for (i=0; i<n-cl+1; i++) 
    	        { 
    	            j = i+cl-1; 
    	            if (str[i] == str[j] && cl == 2) 
    	               L[i][j] = 2; 
    	            else if (str[i] == str[j]) 
    	               L[i][j] = L[i+1][j-1] + 2; 
    	            else
    	               L[i][j] = Math.max(L[i][j-1], L[i+1][j]); 
    	        } 
    	    } 
    	  
    	    return L[0][n-1];
    	    } 
    	  
}
