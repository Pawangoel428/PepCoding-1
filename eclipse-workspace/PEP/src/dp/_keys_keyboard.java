package dp;

import java.util.Scanner;

public class _keys_keyboard {

	 public static void main(String[] args) {
         // TODO Auto-generated method stub
         Scanner scn= new Scanner(System.in);
         int n=scn.nextInt();
 	 	 System.out.println(_2KeysKeyboard(n));
 	 }
 
 	 // -----------------------------------------------------
 	 // This is a functional problem. Only this function has to be written.
 	 // This function takes as input an integer
 	 // It should return the required output
 
 	 public static int _2KeysKeyboard(int n) {
 	 	 //Write your code here
 		 int fact [] = factorize(n);
 		 int Acount = 0;
 		 for(int i=0;i<fact.length;i++)
 		 {
 			 Acount+=Math.pow(i+1,fact[i]);
 			// System.out.println(fact[i]);
 		 }
 		 return Acount;
 	 }

	private static int[] factorize(int n) {
		// TODO Auto-generated method stub
	     int arr[] = new int[n];
	     for(int i=2;i*i<=n;i++)
	     {
	    	 while(n%i==0)
	    	 {
	    		 arr[i]++;
	    		 n=n/i;
	    		 
	    	 }
	    	// System.out.println(arr[i]);
	     }
	     return arr;
	
	}
 	 
 	 
}