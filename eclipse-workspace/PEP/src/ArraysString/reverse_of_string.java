package ArraysString;

import java.util.Scanner;

public class reverse_of_string {

	public static void reverseString(char[] s) {
	 	 //Write your code here	 	 
		char c ;
		for(int i=0;i<s.length/2;i++)
			
		{
			c= s[i];
			s[i] = s[s.length-i-1];
			s[s.length-i-1] = c;
		}
		
	 	 }
	 
	 	 //Don't make any changes here.
	 	 public static void main(String[] args) {
	 	 	 Scanner scn = new Scanner(System.in);
	 	 	 int n = scn.nextInt();
	 	 	 char[] charArray = new char[n];
	 	 	 for (int i = 0; i < charArray.length; i++) {
	 	 	 	 charArray[i] = scn.next().charAt(0);
	 	 	 }
	 
	 	 	 reverseString(charArray);
	 
	 	 	 for (int i = 0; i < charArray.length; i++) {
	 	 	 	 System.out.print(charArray[i] + " ");
	 	 	 }
	 
	 	 }
}
