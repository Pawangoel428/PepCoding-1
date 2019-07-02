package ArraysString;

import java.util.Scanner;

public class integer_to_english_words {


	 public static void main(String[] args) {
	 	 Scanner scn = new Scanner(System.in);
	 	 int num = scn.nextInt();
	 	 System.out.println(numberToWords(num));
	 }
	 // -----------------------------------------------------
	 // This is a functional problem. Do not modify main
	 // This function takes as input an integer num
	 // It should return required output.

	public static String numberToWords(int num) {
       if(num==0)
           return "Zero";
       
       String rv=f1(num,0);
       return rv.substring(0,rv.length()-1);
   }
	
	static String[] got = { "", "Thousand ", "Million ", "Billion ", "Trillion " };
	static String[] teens = { "", "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine ",
			"Ten ", "Eleven ", "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ",
			"Nineteen " };
	static String[] tens = { "", "Ten ", "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ",
			"Ninety " };
	
	
	private static String f1(int num, int i) {
		// TODO Auto-generated method stub
		if(num==0)
			return "";
		
		return f1(num/1000,i+1)+f2(num%1000)+(got[i]);
	}
	private static String f2(int i) {
		// TODO Auto-generated method stub
		if(i>100)
			return teens[i/100]+"Hundred"+f2(i%100);
		else if(i>=20)
			return tens[i/10]+f2(i/10);
		else
			return teens[i];
	}
}
