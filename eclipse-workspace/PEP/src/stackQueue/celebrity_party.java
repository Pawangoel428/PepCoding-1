package stackQueue;

import java.util.*;

public class celebrity_party {
	   static int getId(int M[][], int n) {
	         
		   Stack<Integer> st = new Stack<Integer>();
		   for(int i =0; i<n;i++)
			   st.push(i);
		   while(st.size()!=1)
		   {
			   int num1 = st.pop(),num2 = st.pop();
			   if(M[num1][num2]==1)
				   st.push(num2);
			   else
				   st.push(num1);
		   }
		   int ans = st.pop();
		  // System.out.println(num);
		   for (int j = 0; j < M[0].length; j++) {
	             if (M[ans][j] != 0 && ans != j) {
	                 return -1;
	             }
	         }
	         for (int i = 0; i < M.length; i++) {
	             if (M[i][ans] != 1 && i != ans) {
	                 return -1;
	             }
	         }		
		   return ans;
	     }
	 
	     // Dont make changes here
	     public static void main(String[] args) {
	         Scanner sc = new Scanner(System.in);
	         int n = sc.nextInt();
	         int[][] M = new int[n][n];
	         for (int i = 0; i < n; i++) {
	             for (int j = 0; j < n; j++) {
	                 M[i][j] = sc.nextInt();
	             }
	         }
	         System.out.println(getId(M, n));
	     }
}
