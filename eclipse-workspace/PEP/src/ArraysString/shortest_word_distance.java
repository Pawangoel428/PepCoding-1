package ArraysString;

import java.util.*;

public class shortest_word_distance {

    public static int shortestWordDistance(String[] words, String word1, String word2) {
        //Write your code here
    	int i = Integer.MAX_VALUE,j = Integer.MAX_VALUE,min = Integer.MAX_VALUE;
    	for(int k = 0;k<words.length;k++)
    	{
    		if(words[k].equals(word1))
    			i = k;
    		if(words[k].equals(word2))
				j = k;
    		
    		min = Integer.min(min,Math.abs((j-i)));
    	}
    	return min;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        String word1 = sc.next(), word2 = sc.next();
        System.out.println(shortestWordDistance(words, word1, word2));
    }
}
