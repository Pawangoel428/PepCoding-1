package dp;

import java.util.Scanner;

public class best_time_to_buy_and_sell_stock_version4 {

	  public static void main(String[] args){
	         Scanner scn= new Scanner(System.in);
	         int n=scn.nextInt();
	         int[] price= new int[n];
	         for(int i=0;i<n;i++){
	             price[i]=scn.nextInt();
	         }
	         int k=scn.nextInt();
	         System.out.print(maxProfit(price, n, k));
	     }
	 	 // -----------------------------------------------------
	 	 // This is a functional problem. Only this function has to be written
	 	 // This function takes as input an array and 2 integers
	 	 // It should return the required output
	 
		 	 static int maxProfit(int[] price, int n, int k) {
		 	 	 //Write your code here
		 		 int arr[][] = new int[k+1][n+1];
		 		 
		 		for(int i=0;i<k+1;i++)
		 			 arr[i][0] = 0;
		 		for(int i=0;i<n+1;i++)
		 			 arr[0][i] = 0;
		 		for(int i=1;i<=k;i++)
		 		{
		 			for(int j=1;j<n;j++)
		 			{
		 				int max  =  0;
		 				for(int m = 0;m<j;m++)
		 				max = Math.max(max, price[j]-price[m]+arr[i-1][m]);
		 				
		 				arr[i][j] = Integer.max(max, arr[i][j-1]);
		 			}
		 		}
		 		 return arr[k][n-1];
		 	 }
}
