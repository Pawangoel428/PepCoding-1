package test2;

import java.util.*;

public class Rajneesh_in_trouble {

	
	 static int getId(int M[][], int n) {
         //Your code here
         Stack<Integer> stack = new Stack<>();
         // Adding everyone into the stack
         for (int i = 0; i < M.length; i++) {
             stack.add(i);
         }
         
         while (stack.size() > 1) {
             int a = stack.pop();
             int b = stack.pop();
 
             //If a knows b
             if (M[a][b] == 1) {
                 //If b also a, both are not celebrities
                 if (M[b][a] == 1) {
                     continue;
                 } else {
                     stack.add(b);
                 }
             } //a dont know b
             else {
                 // If b also dont know a
                 if (M[b][a] == 0) {
                     continue;
                 } else {
                     stack.add(a);
                 }
             }
         }
         if (stack.size() == 0) {
             return -1;
         }
         int ans = stack.pop();
         //Last person left may or may not be a celeb
         // Checking if the last person left is actual a celeb or not
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
	 
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int n = sc.nextInt();
		 int M[][] = new int[n][n];
		 int m = sc.nextInt();
		 for(int i=0;i<m;i++)
		 {
			 int r = sc.nextInt();
			 int c = sc.nextInt();
			 M[r][c] = 1;
		 }
		 System.out.println(getId(M,n));
	}
	 
}
