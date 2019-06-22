package stackQueue;

import java.util.*;
import java.io.*;

public class decode_string_at_index {
	   public static String decodeIndex(String S, int K) {
		   long size=0;
	          int n=S.length();
	          for(int i=0;i<n;i++){
	              char ch=S.charAt(i);
	              if(Character.isDigit(ch))
	              {
	                  size*=ch-'0';
	              }
	              else{
	                  size++;
	              }
	          }
	           for (int i = n-1; i >= 0; --i) {
	              char c = S.charAt(i);
	               if(size!=0)
	              K %= size;
	              if (K == 0 && Character.isLetter(c))
	                  return Character.toString(c);

	              if (Character.isDigit(c))
	                  size /= c - '0';
	              else
	                  size--;
	          }
	          return null;
		  	  }
		  
		  
		  
		  	  
		  
		  	  // Dont make changes here
		  	  public static void main(String[] args) {
		  	  	  Scanner sc=new Scanner(System.in);
		  	  	  String s=sc.next();
		  	  	  int k=sc.nextInt();
		  	  	  System.out.println(decodeIndex(s,k));
		  	  }
}
