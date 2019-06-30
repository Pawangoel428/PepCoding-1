package ArraysString;

import java.util.Scanner;

public class nesting_array {

    public static int arrayNesting(int[] arr) {
        //Write your code here
    	int n = arr.length;
    	boolean visited[] = new boolean[n];
		for(int i=0;i<n;i++)
			visited[i] = true;
		int max=0;
		for(int i=0;i<n;i++)
		{
			int length=0;
			int j =arr[i];
			while(j<n&&visited[j])
			{
				 visited[j] = false;
				 //System.out.println(j+"///"+(arr[j])+"<<<<<<<"+visited[j]);
				 j = arr[j];
				//System.out.println(arr[j]);
				 length++;
				 
			}
			max= Integer.max(length, max);
			//System.out.println(":::");
		}
		return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(arrayNesting(arr));
    }
}
