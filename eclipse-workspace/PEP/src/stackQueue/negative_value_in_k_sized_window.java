package stackQueue;

import java.util.Scanner;

public class negative_value_in_k_sized_window {

	 public  static void window(int[] arr, int k){
	 	
		 int a[] = new int[arr.length-k+1];
		 for(int i = 0 ;i<arr.length-k+1;i++)
		 {
			 int j=i;
			 a[i]=0;
			while (j<i+k)
			{
				if(arr[j]<0)
					{a[i] = arr[j];break;}
				else
					j++;
			}
			System.out.println(a[i]);
		 }
	 }
	 
	 
	 
	 
	 
	 
	 
	 	 // Dont make changes here
	 	 public static void main (String[] args) {
	 	      Scanner s=new Scanner(System.in);
	 	 	      int size=s.nextInt();
	 	 	      int[]arr=new int[size];
	 	 	      for(int i=0;i<size;i++){
	 	 	          arr[i]=s.nextInt();
	 	 	      }
	 	 	      int k=s.nextInt();
	 	 	      
	 	 	      
	 	 	     window(arr, k);
	 	 	  
	 	 }
}
