package HashMapHeap;

import java.util.HashMap;
import java.util.Scanner;

public class find_unique_element {

	 public static void main (String[] args)
	  {
	     Scanner scn = new Scanner(System.in);
	 	 
	 	 	 int n = scn.nextInt();
	 	 	 int k=scn.nextInt();
	 	 	 int[] num = new int[n];
	 	 	 for (int i = 0; i < n; i++) {
	 	 	 	     num[i]= scn.nextInt();
	 	 	 }
	 	 	 solve(num,k);
	 	 
	  }
	  
    // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input an array and n length of array.
	 // It should return a boolean value.

	  public static void solve(int [] arr,int k){
	      HashMap<Integer,Integer> hmap=new HashMap<>();
	      for(int val:arr){
	          hmap.put(val,hmap.getOrDefault(val,0)+1);
	      }
	      
	      for(int val:arr){
	          if(hmap.get(val)==1){
	              System.out.println(val);
	              return;
	          }
	      }
	  }
}
