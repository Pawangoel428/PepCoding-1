package stackQueue;

import java.util.Scanner;

public class tiny_big_tiny {

	  public static boolean find132pattern(int[] num) {
      	  int min = Integer.MAX_VALUE;
      	  for(int i=0;i<num.length;i++)
      	  {
      		  min = min>num[i]?num[i]:min;
      		  for(int j = i+1;j<num.length;j++)
      		  {
      			  if(min<num[j]&&num[j]<num[i])
      				  return true;
      		  }
      	  }
      	  return false;
  	  }
  
  
  
  
  
  
  
  	  //Dont make changes here
  	  public static void main(String[] args) {
  	  
  	  	  Scanner sc=new Scanner(System.in);
  	  	  int n=sc.nextInt();
  	  	  int[] A=new int[n];
  	  	  for(int i=0;i<n;i++)A[i]=sc.nextInt();
  	  	  System.out.println(find132pattern(A));
  	  }
}
