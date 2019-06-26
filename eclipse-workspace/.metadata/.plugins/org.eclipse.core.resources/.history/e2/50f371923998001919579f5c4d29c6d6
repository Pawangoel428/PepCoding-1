package HashMapHeap2;

import java.util.Scanner;

public class heap_sort {

	 static void printArray(int arr[]) {
 	 	 int n = arr.length;
 	 	 for (int i = 0; i < n; ++i)
 	 	 	 System.out.print(arr[i] + " ");
 	 	 System.out.println();
 	 }
   
     public static void main(String args[]) 
     { 
         Scanner scn= new Scanner(System.in);
         int n = scn.nextInt(); 
         int[] arr= new int[n];
         for(int i=0;i<n;i++)
             arr[i]=scn.nextInt(); 
         sort(arr);  
         printArray(arr); 
     } 
 
     // -----------------------------------------------------
 	 // This is a functional problem. Only these functions have to be written.
 	 // This function takes as input an array.
 	 
 	 static public void sort(int arr[]) {
 		  int n = arr.length; 
 		  
 	         
 	        for (int i = n / 2 - 1; i >= 0; i--) 
 	            heapify(arr, n, i); 
 	  
 	       
 	        for (int i=n-1; i>=0; i--) 
 	        { 
 	            
 	            int temp = arr[0]; 
 	            arr[0] = arr[i]; 
 	            arr[i] = temp; 
 	  
 	            
 	            heapify(arr, i, 0); 
 	        } 
 	 	 }
 
 	 static void heapify(int arr[], int n, int i) {
 		int largest = i; // Initialize largest as root 
        int l = 2*i + 1; // left = 2*i + 1 
        int r = 2*i + 2; // right = 2*i + 2 
  
        if (l < n && arr[l] > arr[largest]) 
            largest = l; 
  
        
        if (r < n && arr[r] > arr[largest]) 
            largest = r; 
  
         
        if (largest != i) 
        { 
            int swap = arr[i]; 
            arr[i] = arr[largest]; 
            arr[largest] = swap; 
  
             
            heapify(arr, n, largest); 
        } 
 		 
 		 
 	 }
}
