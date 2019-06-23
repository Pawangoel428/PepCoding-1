package HashMapHeap;

import java.util.*;
import java.util.Scanner;

public class find_first_repeated_character {

	public static char solve(String s) {
		 
        HashSet<Character> hset = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (hset.contains(ch)) {
                return ch;
            }
            hset.add(ch);
        }

        return '$';
    }

     public static void main(String[] args) {
 
         Scanner sc = new Scanner(System.in);
         String str = sc.next();
         System.out.println(solve(str));
 
     }
}
