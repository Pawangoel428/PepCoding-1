package ArraysString;

import java.util.*;

public class nice_arrangement_version2 {

	 public static int[] constructArray(int n, int k) {
         // write your code here. 
		 int arr[] = new int[n];
		 for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		 
		 int sol [] = new int[n];
		 for(int i = 0;i < (n-k)-1;i++)
		 {
			 sol[i] = arr[i];
			// System.out.print(sol[i]+" ");
		 }
		 int num = n-k-1;
		 for(int i = n-k-1,j=n-1;i<=j;i++,j--)
		 { 
			 if(i==j)
			 {
				 sol[num] = arr[i];num++;
			 }
			 else
			 {
				 sol[num] = arr[i];num++;
				 sol[num] = arr[j];num++;
			 }
		   
		 }

		 return sol;
         
     }
 
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int N = sc.nextInt();
         int K = sc.nextInt();
 
         int[] result = constructArray(N, K);
         if (verify(result, N, K)) {
             System.out.println("Nice Arrangement");
         } else {
             System.out.println("Try Harder");
         }
     }
 
     // function to display an array.
     public static void display(int[] arr) {
 
         for (int i = 0; i < arr.length; i++) {
             System.out.print(arr[i] + " ");
         }
 
         System.out.println();
     }
 
     // function to verify the result. just ignore it.
     private static boolean verify(int[] arr, int N, int K) {
 
         if (arr.length < N) {
             return false;
         }
 
         boolean[] a = new boolean[N + 1];
         HashSet<Integer> set = new HashSet<>();
 
         for (int i = 0; i < arr.length; i++) {
             if (a[arr[i]]) {
                 return false;
             } else {
                 a[arr[i]] = true;
             }
 
             if (i == N - 1) {
                 break;
             } else {
                 if (set.contains(Math.abs(arr[i] - arr[i + 1])) == false) {
                     set.add(Math.abs(arr[i] - arr[i + 1]));
                 }
             }
 
         }
 
         if (set.size() != K) {
             return false;
         }
 
         return true;
 
     }
 
}
