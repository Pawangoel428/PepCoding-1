package stackQueue;

import java.util.Scanner;

public class largest_min_pair {
	public static long findlargest(long arr[],int n){
	    long max = Integer.MIN_VALUE; 
		for(int i=0;i<arr.length-1;i++)
		{
			if(max<(arr[i]+arr[i+1]))
				max = arr[i]+arr[i+1];
		}
		return max;
	}
	  	  







  // Dont make changes here
  public static void main (String[] args)throws Exception {
  	  Scanner sc=new Scanner(System.in);
  	  int n=sc.nextInt();
          long arr[]=new long[n];
          for(int i=0;i<n;i++)arr[i]=sc.nextLong();
          System.out.println(findlargest(arr,n));
  
  }
}
