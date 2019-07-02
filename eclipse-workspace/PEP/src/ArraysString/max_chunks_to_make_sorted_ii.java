package ArraysString;

import java.util.*;
import java.util.Scanner;

public class max_chunks_to_make_sorted_ii {

	 public static void main(String[] args) {
 	 	 Scanner scn = new Scanner(System.in);
 	 	 int n = scn.nextInt();
 	 	 int[] a = new int[n];
 	 	 for (int i = 0; i < n; i++) {
 	 	 	 a[i] = scn.nextInt();
 	 	 }
 	 	 System.out.println(maxChunksToSorted(a));
 	 }
 
 	 // -----------------------------------------------------
 	 // This is a functional problem. Only this function has to be written
 	 // This function takes as input an array
 	 // It should return required output
 
 	 public static int maxChunksToSorted(int[] arr) {
 	 	 // Write your code here
 		 
 		 Map<Integer, Integer> count = new HashMap();
         int ans = 0, nonzero = 0;

         int[] expect = arr.clone();
         Arrays.sort(expect);

         for (int i = 0; i < arr.length; ++i) {
             int x = arr[i], y = expect[i];

             count.put(x, count.getOrDefault(x, 0) + 1);
             if (count.get(x) == 0) nonzero--;
             if (count.get(x) == 1) nonzero++;

             count.put(y, count.getOrDefault(y, 0) - 1);
             if (count.get(y) == -1) nonzero++;
             if (count.get(y) == 0) nonzero--;

             if (nonzero == 0) ans++;
         }

         return ans;
     }

}
