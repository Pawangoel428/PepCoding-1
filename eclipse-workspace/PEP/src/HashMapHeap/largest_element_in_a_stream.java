package HashMapHeap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class largest_element_in_a_stream {
	 public static void main(String[] args) {
 	 	 Scanner scn = new Scanner(System.in);
 	 	 	 int n = scn.nextInt();
             int k = scn.nextInt();
 	 	 	 int[] arr = new int[n];
 	 	 	 for (int i = 0; i < n; i++) {
 	 	 	 	 arr[i] = scn.nextInt();
 	 	 	 }
 	 	 	 largest(arr, k);
 	 }
 
 	 private static void largest(int[] arr, int k) {
 	 	 int[] ans = new int[arr.length];
 	 	 PriorityQueue<Integer> pq = new PriorityQueue<>();
 	 	 for (int i = 0; i < k - 1; i++) {
 	 	 	 ans[i] = -1;
 	 	 	 pq.add(arr[i]);
 	 	 }
 	 	 pq.add(arr[k - 1]);
 	 	 ans[k - 1] = pq.peek();
 	 	 for (int i = k; i < arr.length; i++) {
 	 	 	 if (pq.peek() < arr[i]) {
 	 	 	 	 pq.remove();
 	 	 	 	 pq.add(arr[i]);
 	 	 	 }
 	 	 	 ans[i] = pq.peek();
 	 	 }
 	 	 for (int val : ans) {
 	 	 	 System.out.print(val + " ");
 	 	 }
 	 	 System.out.println();
 	 }
}
