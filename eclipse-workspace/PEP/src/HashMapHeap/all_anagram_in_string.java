package HashMapHeap;

import java.util.*;

public class all_anagram_in_string {

   	   public static ArrayList<Integer> findAnagrams(String s, String p) {
   	   	   
   	   	   //write your code here
   	   	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
   	   	HashMap<Character, Integer> temp = new HashMap<Character, Integer>(); 
   	   	for(int i=0;i<p.length();i++)
   	   	{
   	   		int freq = hm.getOrDefault(p.charAt(i), 0);
   	   		hm.put(p.charAt(i), freq+1);
   	   	}
   	   	ArrayList<Integer> ar = new ArrayList<Integer>();
   	   	
   	   	for(int i=0,j=0;i<p.length();i++)
   	   	{
   	   		if(hm.equals(temp))
   	   		{
   	   			ar.add(i);
   	   		}
   	   		
   	   	}
   		   return null;
   	   }
   
   	   // -----------------------------------------------------
   	   
   	   public static void main(String[] args) {
   	   	   Scanner scn = new Scanner(System.in);
   	   	   String s = scn.next();
   	   	   String p = scn.next();
   	   	   System.out.println(findAnagrams(s, p));
   	   }
}
