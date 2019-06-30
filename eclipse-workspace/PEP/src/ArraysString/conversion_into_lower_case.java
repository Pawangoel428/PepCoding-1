package ArraysString;

import java.util.Scanner;

public class conversion_into_lower_case {

    public static String toLowerCase(String str) {
        //Write your code here
    	
    	return str.toLowerCase();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(toLowerCase(sc.next()));
    }

}
