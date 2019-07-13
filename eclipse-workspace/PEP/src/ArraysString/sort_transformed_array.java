package ArraysString;

import java.util.*;

public class sort_transformed_array {

    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int[] nums= new int[n];
        for(int i=0;i<n;i++){
            nums[i]=scn.nextInt();
        }
        Arrays.sort(nums);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=scn.nextInt();
        int[] res=sortTransformedArray(nums, a, b, c);
        for(int i=0;i<res.length;i++)
            System.out.print(res[i]+" ");
	 }
	  // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input an array and 3 integers
	 // It should return an integeral array

    public static int[] sortTransformedArray(int[] nums, int a, int b, int c) {
	 	 //Write your code here
    	int arr[] = new int[nums.length];
    	for(int i=0,j=nums.length-1,k= nums.length-1;i<=j;k--)
    	{
    		if(quad(nums[i],a,b,c)>=quad(nums[j],a,b,c))
    		{
    			arr[k] = quad(nums[i],a,b,c);
    			i++;
    		}
    		else
    		{
    			arr[k] = quad(nums[j],a,b,c);
    			j--;
    		}
    			
    	}
    	return arr;
	 }
    
    public static int quad(int x,int a,int b,int c) {
		return (x*x*a+x*b+c);
	}
}
