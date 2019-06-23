package HashMapHeap;

import java.util.*;

public class isomorphic_strings {

	public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        String A= scn.next();
        String B= scn.next();
        System.out.print(isIsomorphic(A, B));
    }
    // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input 2 strings.
	 // It should return a boolean value.

       public static boolean isIsomorphic(String s, String t) {
        //Write your code here
    	   HashMap<Character, Character> hm = new  HashMap<Character, Character>();
    	   if(s.length()!=t.length()) return false;
    	   for(int i=0;i<s.length();i++)
    	   {
    		   if(hm.containsKey(s.charAt(i))&&t.charAt(i)!=hm.get(s.charAt(i)))
    		   {
    			   return false;
    		   }
    		   else
    		   {
    			   hm.put(s.charAt(i), t.charAt(i));
    		   }
    	   }
    	   return true;
    }
}
