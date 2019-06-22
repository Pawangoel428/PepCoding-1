package HashMapHeap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class pepcoding_new_system {

	private static void solve(String[] str) {
        // write your code here.
        HashMap<String,Integer> hs = new HashMap<String,Integer>();
        for(int i=0;i<str.length;i++)
        {
        	int freq = hs.getOrDefault(str[i],0);
        	if(hs.containsKey(str[i]))	
        		System.out.println(str[i]+hs.get(str[i]));
        	
        	else
        		System.out.println("Verified");
        	hs.put(str[i],freq+1);
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Length of the array
        int N = sc.nextInt();

        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
        }
        
        solve(arr);
        
        
    }
}
