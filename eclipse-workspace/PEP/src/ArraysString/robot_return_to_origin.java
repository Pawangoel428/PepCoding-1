package ArraysString;

import java.util.Scanner;

public class robot_return_to_origin {

	 public static boolean judgeCircle(String s) {
 	 	 // Write code here
		 int i=0,j=0;
		 for(int k=0;k<s.length();k++)
		 {
			 if(s.charAt(k)=='U')
				 i++;
			 else if(s.charAt(k)=='D')
				 i--;
			 else if(s.charAt(k)=='L')
					 j--;
			 else if(s.charAt(k)=='R')
				 j++;
		 }
		 if(i==0&&j==0)
			 return true;
		 return false;
 	 }
 
 	 // Don't make any changes here.
 	 public static void main(String[] args) {
 
 	 	 Scanner s = new Scanner(System.in);
 	 	 String str = s.nextLine();
 	 	 System.out.println(judgeCircle(str));
 
 	 }
}
