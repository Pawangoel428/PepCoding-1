package HashMapHeap;

import java.io.*;
import java.util.HashSet;

public class angel_profile {

	 public static void findIfFake(String s) {
 	 	 //Write your code here
		 HashSet<Character> hs = new HashSet<Character>();
		 for(int i=0;i<s.length();i++)
		 {
			 char c = s.charAt(i);
			 if(c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u')
				 hs.add(c);
		 }
		 System.out.println(hs.size());
		 if(hs.size()%2==0) System.out.println("SHE!");
		 else System.out.println("HE!");
 	 }
 	 
 	 //Don't make any changes here
 	 public static void main(String[] args) throws IOException {
 	 	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 	 	 findIfFake(br.readLine());
 	 }
}
