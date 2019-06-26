package HashMapHeap2;

import java.util.*;

public class equivalent_sub_arrays {

	 public static void main(String[] args) {
 	 	 // TODO Auto-generated method stub
 	 	 Scanner scn=new Scanner(System.in);
 	 	 	 int n=scn.nextInt();
 	 	 	 int []arr=new int[n];
 	 	 	 for(int  i=0;i<n;i++){
 	 	 	 	 arr[i]=scn.nextInt();
 	 	 	 }
 System.out.println(val(arr));
 	 }
 
     // -----------------------------------------------------
 	 // This is a functional problem. Only this function has to be written.
 	 // This function takes as input an array
 	 // It should return an integer value.
 	 public static int val(int[] arr) {
 //Write your code here
 		 HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
 		 HashSet<Integer> hs = new HashSet<Integer>();
 		 int count = 0;
 		 for(int i=0;i<arr.length;i++)
 		 {
 			 hs.add(arr[i]);
 		 }
 		 int k = hs.size(),n = arr.length;
 		 int ans = 0, right = 0, window = 0; 
         for (int left = 0; left < n; ++left) 
         { 
             while (right < n && window < k) 
             { 
                 hm.put(arr[right], hm.getOrDefault(arr[right],0) + 1); 
        
                 if (hm.get(arr[right])== 1) 
                     ++window; 
        
                 ++right; 
             } 
        

             if (window == k) 
                 ans += (n - right + 1); 
        
             
             hm.put(arr[left], hm.getOrDefault(arr[left],0) - 1); 
        
             // If frequency is zero then decrease the 
             // window size 
             if (hm.get(arr[left]) == 0) 
                     --window; 
         } 

 		 
 		 return ans;
 	 }
}
