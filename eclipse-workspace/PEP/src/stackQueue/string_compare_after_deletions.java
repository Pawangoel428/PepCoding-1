package stackQueue;

import java.util.*;

public class string_compare_after_deletions {

	  public static boolean compareString(String S, String T) {
  	  	  //write your code here
		  Stack<Character> s1 = new Stack<Character>();
		  Stack<Character> s2 = new Stack<Character>();
		  for(int i=0;i<S.length();i++)
		  {
			  if(s1.isEmpty())
				  s1.push(S.charAt(i));
			  else if(S.charAt(i)=='#')
				  s1.pop();
			  else
				  s1.push(S.charAt(i));
		  }
		  for(int i=0;i<T.length();i++)
		  {
			  if(s2.isEmpty())
				  s2.push(T.charAt(i));
			  else if(T.charAt(i)=='#')
				  s2.pop();
			  else
				  s2.push(T.charAt(i));
		  }
		  if(s1.equals(s2)) return true;
		  return false;
  	  }
  
  //Driver program
  	  public static void main(String[] args) {
  	  	  Scanner scn = new Scanner(System.in);
  	  	  String s1 = scn.next();
  	  	  String s2 = scn.next();
  
  	  	  System.out.println(compareString(s1, s2));
  	  }
}
