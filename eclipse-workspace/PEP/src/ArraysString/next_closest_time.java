package ArraysString;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

public class next_closest_time {

    public static String nextClosestTime(String t) {
        // write your code here. 
        String st[] =  t.split(":");
    	t = st[0]+st[1];
    	System.out.println(t);
    	return null;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String time = sc.next();
        //System.out.println(nextClosestTime(time));
        char min = time.charAt(0);
        TreeSet<Character> tr = new TreeSet<Character>();
        for(int i = 0 ;i<time.length();i++)
        {	min = min>time.charAt(i)?time.charAt(i):min;
        	tr.add(time.charAt(i));
        }
        String ans = new String();
        //System.out.println(min);
        for(int i = time.length()-1;i>=0;i--)
        {
        	char cc = time.charAt(i);
        	if(tr.ceiling(cc)!=null)
        	{
        		ans= tr.ceiling(cc++)+ans;
        		System.out.println(tr.ceiling(cc));
        	}
        	else
        		ans = min+ans;
        }
        System.out.println(ans);
    }
}
