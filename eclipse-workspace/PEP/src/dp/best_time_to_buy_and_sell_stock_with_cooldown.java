package dp;

import java.util.Scanner;

public class best_time_to_buy_and_sell_stock_with_cooldown {

	 public static void main(String[] args){
         Scanner scn= new Scanner(System.in);
         int n=scn.nextInt();
         int[] prices= new int[n];
         for(int i=0;i<n;i++){
             prices[i]=scn.nextInt();
         }
         System.out.print(maxProfit(prices));
     }

     
     public static int maxProfit(int[] prices) {
    
    	    int b0 = -prices[0], b1 = b0;
    	    int s0 = 0, s1 = 0, s2 = 0;

    	    for(int i = 1; i < prices.length; i++) {
    	        b0 = Math.max(b1, s2 - prices[i]);
    	        s0 = Math.max(s1, b1 + prices[i]);
    	        b1 = b0; s2 = s1; s1 = s0; 
    	    }
    	    return s0;
    	}
}
