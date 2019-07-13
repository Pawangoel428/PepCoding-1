package dp;

import java.util.Scanner;

public class _4_keys_keyboard {

	 public static void main(String[] args) {
         Scanner scn= new Scanner(System.in);
         int N=scn.nextInt();
         int arr[] = new int[N];
         System.out.print(maxA(N,arr));
     }
 
 	 // -----------------------------------------------------
 	 // This is a functional problem. Only this function has to be written.
 	 // This function takes as input an integer
 	 // It should return the required output
 	 
     public static int maxA(int N,int arr[]) {
 	 	 // Write your code here
    	 if(N<=6)
    		 return N;
    	 int count =0;
    	 if(arr[N-1]!=0)
    		 return arr[N-1];
    	 else
    	 {count = Math.max(2*maxA(N-3,arr), Math.max(3*maxA(N-4,arr), 4*maxA(N-5,arr)));
    	  arr[N-1] = count;
    	 }
    	 return count;
 	 }
}
