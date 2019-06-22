package HashMapHeap;

import java.util.*;

import HashMapHeap.identify_string.PairComparator;

public class Smallest_Subarray_With_All_occurrences_of_a_most {

    public static void subarrAllOcc(int[] arr) {
        //Write your code here
    	TreeMap<Integer, Integer> hm = new TreeMap<Integer, Integer>();
    	for(int i=0;i<arr.length;i++)
    	{
    		int freq = hm.getOrDefault(arr[i], 0);
    		hm.put(arr[i], freq+1);
    		
    	}
    	System.out.println(hm.firstKey());
    	int min = arr.length-1,max =0;
    	for(int i =0 ;i<arr.length;i++)
    	{	if(arr[i]==hm.firstKey())
    		{
    			min = min>i?i:min;
    			max = max<i?i:max;
    		}
    	
    	}
    	for(int i=min;i<=max;i++)
    		System.out.print(arr[i]+" ");
    	
    }

    //Dont make changes here
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        subarrAllOcc(arr);
    }
}
