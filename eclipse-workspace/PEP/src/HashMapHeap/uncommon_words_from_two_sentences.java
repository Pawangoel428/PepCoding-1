package HashMapHeap;

import java.lang.reflect.Array;
import java.util.*;

public class uncommon_words_from_two_sentences {
	 public static String[] uncommonFromSentences(String A, String B) {
		 
 	 	 HashMap<String, Integer> hmap = new HashMap<>();
 
 	 	 StringBuilder word = new StringBuilder("");
 	 	 char c;
 
 	 	 int idx = 0;
 	 	 while (idx <= A.length()) {
 	 	 	 if (idx == A.length() || A.charAt(idx) == ' ') {
 	 	 	 	 if (hmap.containsKey(word.toString())) {
 	 	 	 	 	 hmap.put(word.toString(), hmap.get(word.toString()) + 1);
 	 	 	 	 } else {
 	 	 	 	 	 hmap.put(word.toString(), 1);
 	 	 	 	 }
 	 	 	 	 word = new StringBuilder("");
 	 	 	 } else {
 	 	 	 	 word.append(A.charAt(idx));
 	 	 	 }
 	 	 	 idx++;
 	 	 }
 
 	 	 idx = 0;
 	 	 while (idx <= B.length()) {
 	 	 	 if (idx == B.length() || B.charAt(idx) == ' ') {
 	 	 	 	 if (hmap.containsKey(word.toString())) {
 	 	 	 	 	 hmap.put(word.toString(), hmap.get(word.toString()) + 1);
 	 	 	 	 } else {
 	 	 	 	 	 hmap.put(word.toString(), 1);
 	 	 	 	 }
 	 	 	 	 word = new StringBuilder("");
 	 	 	 } else {
 	 	 	 	 word.append(B.charAt(idx));
 	 	 	 }
 	 	 	 idx++;
 	 	 }
 
 	 	 ArrayList<String> ans = new ArrayList<>();
 
 	 	 for (String w : hmap.keySet()) {
 	 	 	 if (hmap.get(w) == 1) {
 	 	 	 	 ans.add(w);
 	 	 	 }
 	 	 }
 
 	 	 String[] anss = new String[ans.size()];
 	 	 for (int i = 0; i < ans.size(); i++) {
 	 	 	 anss[i] = ans.get(i);
 	 	 }
 
 	 	 return anss;
 
 	 }
 
 	 public static void main(String[] args) {
 
 	 	 Scanner s = new Scanner(System.in);
 	 	 String A = s.nextLine();
 	 	 String B = s.nextLine();
 
 	 	 String ans[] = uncommonFromSentences(A, B);
 	 	 Arrays.sort(ans);
 	 	 for (int i = 0; i < ans.length; i++) {
 	 	 	 System.out.print(ans[i] + " ");
 	 	 }
 	 }
 
}
