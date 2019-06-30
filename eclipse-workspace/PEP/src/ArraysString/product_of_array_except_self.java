package ArraysString;

import java.util.Scanner;

public class product_of_array_except_self {

	public static int[] productExceptSelf(int[] nums) {
	 	 //Write your code here.
		int product[] = new int[nums.length];
		for(int i=0;i<nums.length;i++)
		{
			int pro = 1;
			for(int j = 0;j<nums.length;j++)
			{
				if(j!=i)
				pro*=nums[j];
			}
			product[i] = pro;
		}
		
		return product;
	 	 }
	 	 
	 	 //Don't make changes here.
	 	 public static void main(String[] args) {
	 	 	 Scanner scn = new Scanner(System.in);
	 	 	 int n = scn.nextInt();
	 	 	 int Input[] = new int[n];
	 	 	 for (int i = 0; i < n; i++) {
	 	 	 	 Input[i] = scn.nextInt();
	 	 	 }
	 	 	 int ans[] = productExceptSelf(Input);
	 	 	 for (int i : ans) {
	 	 	 	 System.out.print(i + " ");
	 	 	 }
	 	 }
}
