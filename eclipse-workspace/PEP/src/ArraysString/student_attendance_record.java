package ArraysString;

import java.util.*;

public class student_attendance_record {

    public static boolean checkRecord(String s) {
        // write your code here. 
        int countA = 0,consecutiveL= 0;
        boolean flag = true;
        for(int i=0;i<s.length();i++)
        {
        	if(s.charAt(i)=='A')
        		{
        		if(countA==1)
        		return false;
        		else
        			countA++;
        		}
        	else if(s.charAt(i)=='L'&&i+2<s.length()&&s.charAt(i+1)=='L'&&s.charAt(i+2)=='L')
        	{
        		return false;
        	}
        }
    	
    	return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        if (checkRecord(S)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
