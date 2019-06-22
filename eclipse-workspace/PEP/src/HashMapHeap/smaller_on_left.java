package HashMapHeap;

import java.util.*;

public class smaller_on_left {

	 public static int[] greatestSmaller(int[] arr) {
         //Write your code here
		 int ar[] = new int[arr.length];
		 TreeSet<Integer> ts = new TreeSet<Integer>();
		 for (int i = 0; i < arr.length; i++) {
			ts.add(arr[i]);
			ar[i] = ts.floor(arr[i]-1)==null?-1:ts.floor(arr[i]-1);
		}
		 return ar;
     }
     
     //Dont make changes here
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int[] arr=new int[n];
         for(int i=0;i<n;i++)arr[i]=sc.nextInt();
         for(int val : greatestSmaller(arr))System.out.print(val+" ");
     }
}
