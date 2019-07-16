package dp;

import java.util.Scanner;

public class paint_fence {


	 public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scn= new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
	 	 System.out.println(CountWays(a,b));
	 }
	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input 2 integers
	 // It should return the required output

	 public static int CountWays(int n, int k) {
	 	 //Write your code here
		 int same = 0,diff = k;
		 for (int i = 0; i < n-1; i++) {
			int temp = diff;
			 diff = (diff+same)*(k-1);
			 same = temp;
			 //System.out.println(diff+" "+same);
		}
		 return same+diff;
	 }
}