package HashMapHeap;

import java.util.*;

import HashMapHeap.sorting_elements_of_an_array_by_frequency.Pair;

public class sort_characters_by_frequency {


	static class Pair{
		char key;
		int freq;
		public Pair(char key,int freq) {
			// TODO Auto-generated constructor stub
			this.freq = freq;
			this.key = key;
		}
	}
    public static void frequencySort(String s) {
        //Write your code here
    	
    	 HashMap<Character, Pair> hm = new HashMap<Character, Pair>();
		  for(int i =0;i<s.length();i++)
		  {
			  if (!hm.containsKey(s.charAt(i))) {
	                 hm.put(s.charAt(i), new Pair(s.charAt(i), 1));
	             } else {
	                 hm.get(s.charAt(i)).freq++;
	             }
		  }
		  for(Map.Entry<Character, Pair> entry: hm.entrySet())
	  {
		  System.out.println("Key = " + entry.getKey() + 
                  ", Value = " + entry.getValue().freq); 
		 
	  	} 
		  ArrayList<Pair> list = new ArrayList<>(hm.values());
//	         Collections.sort(list, new Comparator<Pair>() {
//	             public int compare(Pair a, Pair b) {
//	                 return a.freq != b.freq ? b.freq - a.freq : (a.key < b.key ? -1 : 1);
//	             }
//	         });
		  Collections.sort(list, new Comparator<Pair>() {
	             public int compare(Pair a, Pair b) {
	                 return b.freq - a.freq;
	             }
	         });
	         for (Pair p : list) {
	             while (p.freq-- > 0) {
	                 System.out.print(p.key);
	             }
	         }
	  
		
    }

    //Dont make changes here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        frequencySort(sc.next());
    }
}
