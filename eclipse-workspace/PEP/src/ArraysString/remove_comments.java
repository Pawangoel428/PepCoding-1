package ArraysString;

import java.util.*;

public class remove_comments {

	 public static ArrayList<String> removeComments(String[] source) {
	 //Write your code here
		 
		 boolean inBlock = false;
	        StringBuilder newline = new StringBuilder();
	        List<String> ans = new ArrayList();
	        for (String line: source) {
	            int i = 0;
	            char[] chars = line.toCharArray();
	            if (!inBlock) newline = new StringBuilder();
	            while (i < line.length()) {
	                if (!inBlock && i+1 < line.length() && chars[i] == '/' && chars[i+1] == '*') {
	                    inBlock = true;
	                    i++;
	                } else if (inBlock && i+1 < line.length() && chars[i] == '*' && chars[i+1] == '/') {
	                    inBlock = false;
	                    i++;
	                } else if (!inBlock && i+1 < line.length() && chars[i] == '/' && chars[i+1] == '/') {
	                    break;
	                } else if (!inBlock) {
	                    newline.append(chars[i]);
	                }
	                i++;
	            }
	            if (!inBlock && newline.length() > 0) {
	                ans.add(new String(newline));
	            }
	        }
	        return (ArrayList<String>) ans;
	 }

	 //Don't make any changes here.
	 public static void main(String[] args) {
	 	 Scanner scn = new Scanner(System.in);
	 	 int n = scn.nextInt();
	 	 String[] source = new String[n];
	 	 for (int i = 0; i < source.length; i++) {
	 	 	 source[i] = scn.next();
	 	 }

	 	 System.out.println(removeComments(source));

	 }
}
