package HashMapHeap;

import java.util.*;

public class subarray_range_with_given_sum {


	 static int subArraySum(int arr[], int n, int sum) {
	 	 
	 	 // write your code here
		 int prefSum = 0;
		 int count =0;
		 HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		 hm.put(0, 1);
		 for(int i = 0 ;i<arr.length;i++)
		 {
			 prefSum +=arr[i];
			 if(hm.containsKey(prefSum-sum))
			 {
				 count+=hm.get(prefSum-sum);
			 }
			 int freq = hm.getOrDefault(prefSum, 0);
			 hm.put(prefSum,freq+1);
		 }
	 	 return count;
	 }

	 public static void main(String[] args) {
	 	 Scanner scn = new Scanner(System.in);
	 	 int n = scn.nextInt();
	 	 int sum = scn.nextInt();
	 	 int[] arr = new int[n];
	 	 for (int z = 0; z < n; z++) {
	 	 	 arr[z] = scn.nextInt();
	 	 }
	 	 System.out.println(subArraySum(arr, n, sum));
	 }
}
