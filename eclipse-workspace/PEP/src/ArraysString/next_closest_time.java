package ArraysString;

import java.util.Scanner;

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
        System.out.println(nextClosestTime(time));

    }
}