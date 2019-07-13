package dp;

import java.util.Scanner;

public class paint_house_version2 {

	 public static void main(String[] args) {
		 
	     Scanner scn= new Scanner(System.in);
	     int n=scn.nextInt();
	     int k=scn.nextInt();
	     int[][] costs = new int[n][k];
	     for(int i=0;i<n;i++){
	         for(int j=0;j<k;j++){
	             costs[i][j]=scn.nextInt();
	         }
	     }
	     System.out.println(minCostII(costs));
	 	 }
	 	 // -----------------------------------------------------
	 	 // This is a functional problem. Only this function has to be written.
	 	 // This function takes as input 2d array
	 	 // It should return the required output
	 
	 	 public static int minCostII(int[][] costs) {
	 	 	 //Write your code here
	 		 if (costs == null || costs.length == 0) {
	             return 0;
	         }
	          
	         int n = costs.length;
	         int k = costs[0].length;
	          
	         int[][] dp = new int[n][k];
	          
	         for (int i = 0; i < k; i++) {
	             dp[0][i] = costs[0][i];
	         }
	          
	         for (int i = 1; i < n; i++) {
	             for (int j = 0; j < k; j++) {
	                 dp[i][j] = Integer.MAX_VALUE;
	                 for (int m = 0; m < k; m++) {
	                     if (m != j) {
	                         dp[i][j] = Math.min(dp[i - 1][m] + costs[i][j], dp[i][j]);
	                         
	                     }
	                 }
	             }
	         }
	          
	         int minCost = Integer.MAX_VALUE;
	         for (int i = 0; i < k; i++) {
	        	 System.out.println(dp[n - 1][i]);
	             minCost = Math.min(minCost, dp[n - 1][i]);
	         }
	          
	         return minCost;
	 	 }
}
