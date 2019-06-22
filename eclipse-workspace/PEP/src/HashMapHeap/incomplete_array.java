package HashMapHeap;

import java.util.HashSet;
import java.util.Scanner;

public class incomplete_array {

	public static int incomplete(int[] arr) {
	 	 // write your code here
		int max = arr[0],min = arr[0];
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(!hs.contains(arr[i])) hs.add(arr[i]);
			max = max>arr[i]?max:arr[i];
			min = min<arr[i]?min:arr[i];
		}
		int count = 0;
		for(int i=min;i<=max;i++)
		{
			if(!hs.contains(i)) count++;
		}
		return count;
	 }

	 // -----------------------------------------------------

	 public static void main(String[] args) {
	 	 Scanner scn = new Scanner(System.in);
	 	 int n = scn.nextInt();
	 	 int[] arr = new int[n];
	 	 for (int i = 0; i < n; i++) {
	 	 	 arr[i] = scn.nextInt();
	 	 }
	 	 System.out.println(incomplete(arr));
	 }
}
