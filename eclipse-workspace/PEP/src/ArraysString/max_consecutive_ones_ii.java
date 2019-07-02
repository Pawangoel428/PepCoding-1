package ArraysString;

import java.util.Scanner;

public class max_consecutive_ones_ii {

	public static int findMaxConsecutiveOnes(int[] nums) {
	 	 // write your code here.
	    int zero = 0,maxlen = 0,k=1;
	    for(int i=0,h=0;h<nums.length;h++)
	    {
	    	if(nums[h]==0)
	    		zero++;
	        while (zero > k)
                if (nums[i++] == 0)
                    zero--;                                     
            maxlen = Math.max(maxlen, h - i + 1);
	    }
	    
	    return maxlen;
	 }

	 public static void main(String[] args) {
	 	 Scanner sc = new Scanner(System.in);

	 	 // Input for length of first array.
	 	 int N = sc.nextInt();

	 	 int[] arr1 = new int[N];

	 	 // Input for array1 elements.
	 	 for (int i = 0; i < arr1.length; i++) {
	 	 	 arr1[i] = sc.nextInt();
	 	 }

	 	 int result = findMaxConsecutiveOnes(arr1);

	 	 System.out.println(result);

	 }

	 // Function to display an array.
	 public static void display(int[] arr) {

	 	 for (int i = 0; i < arr.length; i++) {
	 	 	 System.out.print(arr[i] + " ");
	 	 }

	 	 System.out.println();
	 }

}
