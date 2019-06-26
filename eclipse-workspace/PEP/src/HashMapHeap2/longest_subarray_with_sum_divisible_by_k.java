package HashMapHeap2;

import java.io.IOException;
import java.util.*;

public class longest_subarray_with_sum_divisible_by_k {

	 public static void print(int n, int[] arr, int k) {
	 	 //Write your code here	 	 
	 HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
	 hm.put(0, -1);
	 int sum =0,max =0;
	 for(int i=0;i<n;i++)
	 {
		 sum+=arr[i];
		 int mod =0;
		 if(sum<0) mod = (sum%k)+k;
		 else mod = sum%k;
		 if(!hm.containsKey(mod))
		 {
			 hm.put(mod, i);
		 }
		 else
		 {
			 int freq = hm.get(mod);
			// System.out.println(freq);
			 max = max>(i-freq)?max:(i-freq);
		 }
	 }
		 System.out.println(max);
	 	 }
	 	 //Don't make any changes here.
	 	 public static void main(String[] args) throws IOException {
	 	 	 Scanner s=new Scanner(System.in);
	 	 	 int n = s.nextInt();
	 	 	 int[] num = new int[n];
	 	 	 for (int i = 0; i < n; i++) {
	 	 	 	 num[i] = s.nextInt();
	 	 	 }
	 	 	 int k = s.nextInt();	 
	 	 	 print(n, num, k);
	 	 }
}
