package ArraysString;

import java.util.Scanner;

public class add_bold_tag_in_string {

	 
	 public static void main(String[] args) {
	 	 Scanner scn = new Scanner(System.in);
	 	 String s = scn.next();
	 	 int n = scn.nextInt();
	 	 String[] dict = new String[n];
	 	 for (int i = 0; i < n; i++) {
	 	 	 dict[i] = scn.next();
	 	 }
	 	 System.out.println(addBoldTag(s, dict));
	 }

	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input an array of strings and a string
	 // It should return required output.
	 public static String addBoldTag(String s, String[] dict) {
	 	 // Write your code here
		  boolean[] bold = new boolean[s.length()];
	        for (String d: dict) {
	            for (int i = 0; i <= s.length() - d.length(); i++) {
	                if (s.substring(i, i + d.length()).equals(d)) {
	                    for (int j = i; j < i + d.length(); j++)
	                        bold[j] = true;
	                }
	            }
	        }
	        StringBuilder res = new StringBuilder();
	        for (int i = 0; i < s.length();) {
	            if (bold[i]) {
	                res.append("<b>");
	                while (i < s.length() && bold[i])
	                    res.append(s.charAt(i++));
	                res.append("</b>");
	            } else
	                res.append(s.charAt(i++));
	        }
	        return res.toString();
	 }
}
