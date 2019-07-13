package dp;

import java.util.Scanner;

public class minimum_steps_to_minimize_n_as_per_given_condition {

	 public static void main(String[] args) {
 	 	 // TODO Auto-generated method stub
 	 	 Scanner scn = new Scanner(System.in);
 	 	 	 int n = scn.nextInt();
 	 	 	 System.out.println(count_min(n));
 	 }
 	 // -----------------------------------------------------
 	 // This is a functional problem. Only this function has to be written.
 	 // This function takes as input an integer
 	 // It should return the required output
 	 public static int count_min(int n) {
 	 	 // Write your code here
 		 
 		 int steps[] = new int[n];
 		 
 		 for(int i=1;i<n;i++)
 		 {
 			 int max = steps[i-1];
 			 if(i%2==0)
 				 max = Math.min(steps[i/2], max);
 			 else if(i%3==0)
 				 max = Math.min(steps[i/3], max);
 			 steps[i] = max+1;
 			 //System.out.println(max);
 		 }
 		 
 		 return steps[n-1];
 	 }
}
