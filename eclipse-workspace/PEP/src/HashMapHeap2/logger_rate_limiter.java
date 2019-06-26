package HashMapHeap2;

import java.util.*;

public class logger_rate_limiter {

	 static class Logger {
		 
         /**
          * Initialize your data structure here.
          * 
          */
		 HashMap<String, Integer> hm ;
         public Logger() {
         hm = new HashMap<String, Integer>();
         }
 
         /**
          * Returns true if the message should be printed in the given timestamp,
          * otherwise returns false. If this method returns false, the message
          * will not be printed. The timestamp is in seconds granularity.
          */
         public boolean shouldPrintMessage(int timestamp, String message) {
             //Write your code here
        	 if(!hm.containsKey(message))
        	 { hm.put(message, timestamp);return true;}
        	 else
        	 {
        		 int freq =  hm.get(message);
        		 if(freq+10<=timestamp)
        		 { hm.put(message, timestamp);
        		return true;}
        		 else
        			 return false;
        	 }
        	
         }
 	 }
         public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             Logger lg = new Logger();
             int n = sc.nextInt();
             int[] arr = new int[n];
             for (int i = 0; i < n; i++) {
                 arr[i] = sc.nextInt();
             }
             String[] S = new String[n];
             for (int i = 0; i < n; i++) {
                 S[i] = sc.next();
             }
             for (int i = 0; i < n; i++) {
                 System.out.print(lg.shouldPrintMessage(arr[i], S[i]) + " ");
             }
         }
     
}
