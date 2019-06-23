package HashMapHeap;

import java.util.HashMap;
import java.util.Scanner;

public class first_unique_character_in_a_string {

	  public static void main(String[] args){
          Scanner scn = new Scanner(System.in);
          String s= scn.next();
          System.out.print(firstUniqChar(s));
      }
      // -----------------------------------------------------
  	  // This is a functional problem. Only this function has to be written.
  	  // This function takes as input a String s
  	  // Return index of first unique character, if none present, return -1
      public static int firstUniqChar(String s) {
          //Write your code here
    	  HashMap<Character, Integer> hm  = new HashMap<Character, Integer>();
    	  for(char ch : s.toCharArray())
    	  {
    		  int freq = hm.getOrDefault(ch, 0);
    		  hm.put(ch, freq+1);
    		  
    	  }
    	  char unq = '$';
    	  for(int i=0;i<s.length();i++)
    	  {
    		  if(hm.get(s.charAt(i))==1)
    			  return i;
    	  }
          return -1;
      }
}
