package stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class largest_rectangle_in_a_matrix {
	 
	 public static int maxrect(int arr[][],int col){
	 
		 int s[] = arr[0];
		 int max = 0;
		 for(int i=1;i<arr.length;i++)
		 {
			 for(int j=0;j<col;j++)
			 {
				 if(arr[i][j]==0)
					 s[j] = 0;
				 else
					 s[j]++;
			 }
			 int m = maxRectArea(s);
			 max = (m>max)?m:max;
		 }
		 return max ;
	 }
	 public static int maxRectArea(int[] ht) {
   	  
         if(ht.length==0)
             return 0;
         Stack<Integer> st=new Stack<>();
         int rb[] = new int[ht.length];
 	  	  int lb[] = new int[ht.length];
 	  	  rb[ht.length - 1] = ht.length - 1;
 	  	  st.push(ht.length - 1);
 	  	  for (int i = ht.length - 2; i >= 0; i--) {
 
 	  	  	  while (st.size() > 0 && ht[st.peek()] >= ht[i]) {
 	  	  	  	  st.pop();
 	  	  	  }
 	  	  	  rb[i] = (st.size() > 0) ? st.peek()-1: ht.length-1;
 	  	  	  st.push(i);
 	  	  }
 
 	  	  while (st.size() > 0) {
 	  	  	  st.pop();
 	  	  }
 	  	  st.push(0);
 	  	  lb[0]=0;
 	  	  for (int i = 1; i < ht.length; i++) {
 	  	  	  while (st.size() > 0 && ht[st.peek()] >= ht[i]) {
 	  	  	  	  st.pop();
 	  	  	  }
 	  	  	  lb[i] = (st.size() > 0) ? st.peek()+1 : 0;
 	  	  	  st.push(i);
 	  	  }
 
 	  	  int maxa = Integer.MIN_VALUE;
 	  	  for (int i = 0; i < ht.length; i++) {
 	  	  	  maxa = Math.max(maxa, (rb[i] - lb[i]+1) * ht[i]);
 	  	  }
 
     return maxa;
  }
	 	 //Dont make changes
	 	 public static void main(String[] args) {
	 	 	 Scanner sc=new Scanner(System.in);	 
	 	 	 int row=sc.nextInt();
	 	 	 int col=sc.nextInt();
	 	 	 int[][] A=new int[row][col];
	 	 	 for(int i=0;i<row;i++)
	 	 	 	 for(int j=0;j<col;j++)
	 	 	 	 	 A[i][j]=sc.nextInt();
	           System.out.println( maxrect(A,col));
	     
	 	 }
}
