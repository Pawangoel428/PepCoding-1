package HashMapHeap2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class longest_palindrome {

	 public static int longestPalindrome(String s) {
	 //Write your code here	 	 
		 HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		 for(int i=0;i<s.length();i++)
		 {
			 int freq = hm.getOrDefault(s.charAt(i), 0);
			 hm.put(s.charAt(i), freq+1);
		 }
		 int sum = 0;
		 boolean flag = false;
		 for(Map.Entry<Character, Integer> entry:hm.entrySet())
		 {
			sum +=entry.getValue()-(entry.getValue()%2);
			if(entry.getValue()%2!=0) flag = true;
		 }
		 if(flag) sum++;
		 return sum;
	 	 }
	 
	 
	 	 //Don't make any changes here.
	 	 public static void main(String[] args) {
	 
	 	 	 Scanner s = new Scanner(System.in);
	 	 	 String str = s.next();
	 	 	 System.out.println(longestPalindrome(str));
	 
	 	 }
}
