package HashMapHeap;

import java.util.*;

public class subarray_sums_divisible_by_k {

	public static int subarraysDivByK(int[] A, int K) {
	 	 	 int sum = 0, count = 0;
	 	 	 int[] rem = new int[K];
	 	 	 for (int i = 0; i < A.length; ++i) {
	 	 	 	 sum += A[i];
	 	 	 	 if (sum % K == 0)
	 	 	 	 	 ++count;
	 	 	 	 count += rem[(sum % K + K) % K]++;
	 	 	 }
	 	 	 return count;
	 	 
	 }

	 public static void main(String[] args) {
	 	 Scanner scn = new Scanner(System.in);
	 	 int n = scn.nextInt();
	 	 int k = scn.nextInt();
	 	 int[] arr = new int[n];
	 	 for (int z = 0; z < n; z++) {
	 	 	 arr[z] = scn.nextInt();
	 	 }
	 	 System.out.println(subarraysDivByK(arr, k));
	 }
}
