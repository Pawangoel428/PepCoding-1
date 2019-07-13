package ArraysString;

import java.util.*;

public class flip_string_to_monotone_increasing {

	 public static void main(String[] args){
	     Scanner scn= new Scanner(System.in);
	     String s= scn.next();
	     System.out.print(minFlipsMonoIncr(s));
	 }
	    	 // -----------------------------------------------------
	 	 // This is a functional problem. Only this function has to be written.
	 	 // This function takes as input a string
	 	 // It should return required output.	  
	 
	 public static int minFlipsMonoIncr(String S) {
	        //Write your code here
		 
		 int count00 = 0,count10 = 0;
		 if(S.charAt(0)=='0')
		 {
			 if(S.charAt(1)=='1')
				 count00 = 1;
			 else
				 count10 = 1;
		 }
		 else if(S.charAt(0)=='1')
		 {
			 if(S.charAt(1)=='1')
				 count10 = 2;
			 else
				 count00 = 1;
		 }
		 
		 for(int i = 2;i<S.length();i++)
		{
			 if(S.charAt(i)=='1')
			 { 
			   count10 = Integer.min(count10, count00);
			   count00++;
				// System.out.println(count10+" "+count00);
			 }
			 else
			 {
				 count10 = Integer.min(count10, count00)+1;
				/// System.out.println(count10+" "+count00);
			 }
			 
				 
		 }
		 //count00++;//to make it 0000000 to 00000001
		 return count10;
	 	 }
}
