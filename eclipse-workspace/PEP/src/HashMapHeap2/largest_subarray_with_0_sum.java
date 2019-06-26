package HashMapHeap2;

import java.util.HashMap;
import java.util.Scanner;

public class largest_subarray_with_0_sum {

	static int maxLen(int arr[], int n) {
	 	 //Write your code here
		int k=0;
		 HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		 hm.put(0, -1);
		 int sum = 0,max = 0;
		 for(int i=0;i<n;i++)
		 {
			 sum+=arr[i];
			if(!hm.containsKey(sum-k)) 
			{
				hm.put(sum, i);
			}
			else
			{
				int freq = hm.get(sum-k);
				//System.out.println(freq);
				max = max>(i-freq)?max:(i-freq);
			}
		 }
		 System.out.println(max);
		 return 0;
	 }
	 
	     public static void main(String[] args) {
	         Scanner sc = new Scanner(System.in);
	         int n = sc.nextInt();
	         int[] arr = new int[n];
	         for (int i = 0; i < n; i++) {
	             arr[i] = sc.nextInt();
	         }
	         maxLen(arr, n);
	     }
}
