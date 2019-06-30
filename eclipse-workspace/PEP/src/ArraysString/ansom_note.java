package ArraysString;

import java.util.*;

public class ansom_note {

	 public static boolean canConstruct(String rans, String magazine) {
	 //Write your code here	 
		 HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		 for(int i=0;i<magazine.length();++i)
		 {
			 int freq = hm.getOrDefault(magazine.charAt(i),0);
			 hm.put(magazine.charAt(i), freq+1);
		 }
		// int count = 0;
		 for(int i=0;i<rans.length();i++)
		 {
			 if(hm.containsKey(rans.charAt(i)))
			 {
				 int freq = hm.get(rans.charAt(i));
				 if(freq ==1)
					 hm.remove(rans.charAt(i));
				 else
					 hm.put(rans.charAt(i), freq-1);
			 }
			 else
			 {
				 return false;
			 }
		 }
		 
		 return true;
	 }
	 //Don't make any changes here
	 public static void main(String[] args) {
	 	 Scanner scn = new Scanner(System.in);
	 	 String s = scn.next();
	 	 String t = scn.next();
	 	 System.out.print(canConstruct(s, t));

	 }

}
