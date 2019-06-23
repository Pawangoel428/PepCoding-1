package HashMapHeap;

import java.io.*;
import java.util.*;
public class is_frequency_equal {

	 public static boolean isFrequencyEqual(String str) {
 	 	 //Write your code here	 	
		 HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		 int max = 0,secondMax =0;
		 
		 for(char c : str.toCharArray())
		 {
			 int freq = hm.getOrDefault(c, 0)+1;
			 hm.put(c, freq);
			 max = max<freq?freq:max;
		 }
		 int count1=0,count2=0;
		 for(Map.Entry<Character, Integer> entry : hm.entrySet())
		 {
			// System.out.println(entry.getValue()+" "+entry.getKey());
			 if(entry.getValue()==max)
				 count1++;
			 else if(entry.getValue()==max-1)
				 count2++;
		 }
		 
		// System.out.println(count1+" "+count2);
		 if(count2+1==hm.size()&&count1==1) return true;
		 //else if(hm.containsValue(1)||count1+1==hm.size()) return true;
		 return false;
 	 }
 
 	 //Don't make any changes here
 	 public static void main(String[] args) throws IOException {
 	 	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 	 	 String s = br.readLine();
 	 	 boolean bl = isFrequencyEqual(s);
 	 	 System.out.println(bl);
 	 }
}
