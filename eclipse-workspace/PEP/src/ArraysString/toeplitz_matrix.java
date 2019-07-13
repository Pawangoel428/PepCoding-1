package ArraysString;

import java.util.Scanner;

public class toeplitz_matrix {


    public static boolean isToeplitzMatrix(int[][] matrix) {
      //Write your code here
    	int i=0,j=0;
    	for(int g = -matrix.length+1;g<matrix[0].length;g++)
    	{
    		if(g>0)
    		{
    			i=0;j = i+g;
    		}
    		else
    		{
    			j=0;i=j-g;
    		}
    		while(i<matrix.length-1&&j<matrix[0].length-1)
    		{
    			if(matrix[i][j]!=matrix[i+1][j+1])
    				
    				return false;
    			//System.out.println(matrix[i][j]);
    			i++;
    			j++;
    		}
    	}
    	
    	return true;
      }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(isToeplitzMatrix(arr));
    }
}
