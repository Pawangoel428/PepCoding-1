package HashMapHeap;

import java.util.*;


public class two_sum {
	 public static ArrayList<Integer> twoSum(ArrayList<Integer> nums, int target) {
	 	 //Write your code here
		 ArrayList<Integer> ar = new ArrayList<Integer>();
		 for(int i=0;i<nums.size()-1;i++)
		 {
			 for(int j=nums.size()-1;j>i;j--)
			 {
				 if(nums.get(i)+nums.get(j)==target)
				 {ar.add(i);ar.add(j);return ar;}
			 }
		 }
		 return ar;
	 }
	 
	 	 //Don't make any changes here.
	 	 public static void main(String[] args) {
	 
	 	 	 Scanner s = new Scanner(System.in);
	 	 	 ArrayList<Integer> nums = new ArrayList<Integer>();
	 	 	 int n = s.nextInt();
	 	 	 for (int i = 0; i < n; i++) {
	 	 	 	 nums.add(s.nextInt());
	 	 	 }
	 	 	 int target = s.nextInt();
	 	 	 System.out.println(twoSum(nums, target));
	 
	 	 }
	 	 
}
