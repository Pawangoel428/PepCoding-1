package dp;

import java.util.Scanner;

public class minimum_partition {

	 public static void main(String[] args) {
 	 	 Scanner scn = new Scanner(System.in);
 	 	 	 int n = scn.nextInt();
 	 	 	 int a[] = new int[n];
 	 	 	 for (int i = 0; i < n; i++)
 	 	 	 	 a[i] = scn.nextInt();
 	 	 	 System.out.println(findMinSumPartition(a, n));
 	 }
 	 // -----------------------------------------------------
 	 // This is a functional problem. Only this function has to be written.
 	 // This function takes as input an array alongwith its length
 	 // It should return the required output
 
 	 static int findMinSumPartition(int arr[], int n) {
 	 	 // Write your code here
 		 int sum = 0 ;
 		 for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
 		 
 		 boolean qb[][] = new boolean[arr.length+1][sum+1];
 		 for (int i = 0; i < arr.length; i++) {
			qb[i][0] = true;
		}
 		 for (int i = 0; i < sum; i++) {
 			qb[0][i] = false;
 		} 
 		 
 		 for (int i = 1; i < qb.length; i++) {
 			 for (int j = 1; j < qb[0].length; j++) {
				qb[i][j] = qb[i-1][j];
				if (arr[i - 1] <= j) 
                    qb[i][j] = qb[i - 1][j - arr[i - 1]]; 
			}
		}
 		 int j = 0;
 		 for(int i = sum/2;i>=0;i--)
 		 {
 			 if(qb[qb.length-1][i]==true)
 			 {
 				 j = i;
 				 break;
 			 }
 		 }
 		 return sum-(2*j);
 		 
 	 }
}
