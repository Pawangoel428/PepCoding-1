package dp;

import java.util.Scanner;

public class minimum_path_sum {

	 public static void main(String[] args) {
         Scanner scn= new Scanner(System.in);
         int r=scn.nextInt();
         int c=scn.nextInt();
         int m2[][] = new int[r][c];
         for(int i=0;i<r;i++){
             for(int j=0;j<c;j++){
                 m2[i][j]=scn.nextInt();
             }
         }
 	 	 System.out.println(minPathSum(m2));
 	 }
 	 // -----------------------------------------------------
 	 // This is a functional problem. Only this function has to be written.
 	 // This function takes as input a 2D array
 	 // It should return the required output
 
	 public static int minPathSum(int[][] grid) {
		    return dfs(0,0,grid);
		}
		 
		public static int dfs(int i, int j, int[][] grid){
		    if(i==grid.length-1 && j==grid[0].length-1){
		        return grid[i][j];
		    }
		 
		    if(i<grid.length-1 && j<grid[0].length-1){
		        int r1 = grid[i][j] + dfs(i+1, j, grid);
		        int r2 = grid[i][j] + dfs(i, j+1, grid);
		        return Math.min(r1,r2);
		    }
		 
		    if(i<grid.length-1){
		        return grid[i][j] + dfs(i+1, j, grid);
		    }
		 
		    if(j<grid[0].length-1){
		        return grid[i][j] + dfs(i, j+1, grid);
		    }
		 
		    return 0;
	}
}
