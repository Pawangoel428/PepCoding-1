package HashMapHeap2;

import java.util.*;

public class kth_element_in_matrix {

	 public static int findKthSmallest(int[][] nums, int k) {
	        // write your code here.
	     PriorityQueue<Integer> pq = new PriorityQueue<Integer>(k,Collections.reverseOrder());
	     int size =0;
	     for(int i=0;i<nums.length;i++)
	     {
	    	 for(int j=0;j<nums[0].length;j++)
	    	 {
	    		 if(size<k)
	    		 {
	    			 pq.add(nums[i][j]);
	    			 size++;
	    		 }
	    		 else if(nums[i][j]<pq.peek())
	    		 {
	    			 pq.remove();
	    			 pq.add(nums[i][j]);
	    		 }
	    	 }
	     }
		 
		 return pq.peek();
	     }
	 
	     public static void main(String[] args) {
	         Scanner sc = new Scanner(System.in);
	 
	         // Input for length of first array.
	         int N = sc.nextInt();
	 
	         int[][] mat = new int[N][N];
	 
	         // Input for matrix elements.
	         for (int i = 0; i < mat.length; i++) {
	             for (int j = 0; j < mat[0].length; j++) {
	                 mat[i][j] = sc.nextInt();
	             }
	         }
	 
	         int K = sc.nextInt();
	 
	         int result = findKthSmallest(mat, K);
	 
	         System.out.println(result);
	 
	     }
	 
	     // Function to display a matrix.
	     public static void display(int[][] mat) {
	 
	         for (int i = 0; i < mat.length; i++) {
	             for (int j = 0; j < mat[0].length; j++) {
	                 System.out.print(mat[i][j] + " ");
	             }
	             System.out.println();
	         }
	     }
	 
}
