package test2;

import java.util.Scanner;


public class swap_kth_node_from_beginning_and_end_in_linked_list {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int K = sc.nextInt();
        int arr[] = new int[n1];
       for(int i=0;i<n1;i++)
       {
    	   arr[i] = sc.nextInt();
       }
       if(K<=n1) {
       int temp = arr[K-1];
       arr[K-1] = arr[n1-1];
       arr[n1-1] = temp;
       for(int i=0;i<n1;i++)
       {System.out.print(arr[i]+" ");
       }}
    }

	

}
