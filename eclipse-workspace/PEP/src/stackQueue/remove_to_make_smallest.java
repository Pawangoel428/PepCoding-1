package stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class remove_to_make_smallest {
	  public static String removeMakeSmallest(String num, int k) {
		  Stack<Integer> st = new Stack<Integer>();
		  for(int i=0;i<num.length();i++)
		  {
			  int n = Integer.parseInt(num.charAt(i)+"");
			  System.out.println(n);
		  }
		  return null;
      }

      
      public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          int k=sc.nextInt();
          String s=sc.next();
          System.out.println(removeMakeSmallest(s, k));
      }
}
