package HashMapHeap;

import java.util.HashMap;
import java.util.Scanner;

public class school_assembly {
	
    public static void minTransfer(int[] heights) {
        // Write your code here
    	int maxIncreasingSubsequence  = MaxSubSequence(heights);
    	System.out.println(heights.length-maxIncreasingSubsequence-1);
    }

    private static int MaxSubSequence(int[] arr) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int max = 0;
		for(int i=0;i<arr.length;i++)
		{
			int frq = hm.getOrDefault(arr[i]-1, 0);
			max = max<frq?frq:max;
			hm.put(arr[i], frq+1);
		}
		return max;
	}

	//Dont make changes here
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = scn.nextInt();
        }
        minTransfer(heights);
    }
}
