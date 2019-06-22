package HashMapHeap;

import java.io.*;
import java.util.*;
public class distinct_elements_in_a_stream {
	 public static void print(String[] arr) throws IOException {
		 
 	 	 HashMap<Integer, Integer> hmap = new HashMap<>();
 	 	 for (String str : arr) {
 	 	 	 String[] hp = str.split(" ");
 	 	 	 char oper = hp[0].charAt(0);
 	 	 	 int num = Integer.parseInt(hp[1]);
 	 	 	 if (oper == 'A') {
 	 	 	 	 hmap.put(num, hmap.getOrDefault(num, 0) + 1);
 	 	 	 } else {
 	 	 	 	 if (hmap.containsKey(num)) {
 	 	 	 	 	 hmap.put(num, hmap.getOrDefault(num, 0) - 1);
 
 	 	 	 	 	 if (hmap.get(num) == 0) {
 	 	 	 	 	 	 hmap.remove(num);
 	 	 	 	 	 }
 	 	 	 	 }
 	 	 	 }
 
 	 	 	 System.out.println(hmap.size());
 	 	 }
 	 }
	 	 //Don't make any changes here
	 	 public static void main(String[] args) throws IOException {
	 	 	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 	 	 int n = Integer.parseInt(br.readLine());
	 	 	 String[] arr = new String[n];
	 	 	 for (int i = 0; i < n; i++) {
	 	 	 	 arr[i] = br.readLine();
	 	 	 }
	 
	 	 	 print(arr);
	 
	 	 }
}
