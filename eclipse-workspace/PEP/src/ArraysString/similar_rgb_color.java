package ArraysString;

import java.util.Scanner;

public class similar_rgb_color {

//	  public static String similarRGB(String color) {
//	         //Write your code here
//		  color = color.substring(1);
//		  String ans = new String();
//		  for(int i = 0;i<6;i++)
//		  {
//			  char ar[] = new char[2];
//			  
//			  ar[0] = color.charAt(i);
//			  ar[1] = color.charAt(++i);
//			 // System.out.println(ar[0]+" "+ar[1]);
//			  if(ar[0]>=ar[1])
//				 {ans+= compare(ar[0],ar[1]);//aa vs a-1 a-1
//				 	ans+= compare(ar[0],ar[1]);//aa vs a-1 a-1
//				 }
//			  else if(ar[0]<=ar[1])
//				 {ans +=  compare((char) (ar[0]+1),ar[1]);
//				 ans +=  compare((char) (ar[0]+1),ar[1]);
//				 }
//			 // System.out.println(ans);
//				  
//		  }
//		  return '#'+ans;
//	     }
//	 public static char compare(char a,char b)
//	 {
//		 System.out.println(a+" "+b);
//		 if(a-b>17+b-a)
//			 {return (char) (a-1);}
//		 System.out.println(a+" "+b);
//		 return a;
//	 }
//	 
	 public static String similarRGB(String color) {
	        if (color == null || color.length() == 0) {
	            return "";
	        }
	 
	        String[] dict = new String[]{"00", "11", "22", "33", "44", "55", "66", "77", "88", "99", 
	                                     "aa", "bb", "cc", "dd", "ee", "ff"};
	        int minDistance = Integer.MAX_VALUE;
	        String ans = "";
	 
	        for (String R : dict) {
	            for (String G: dict) {
	                for (String B : dict) {
	                    String s = "#" + R + G + B;
	                    int distance = getDistance(s, color);
	                    if (distance < minDistance) {
	                        ans = s;
	                        minDistance = distance;
	                    }
	                }
	            }
	        }
	 
	        return ans;
	    }
	 
	    private static int getDistance(String a, String b) {
	        int distance = 0;
	        for (int i = 1; i < 7; i += 2) {
	            int n1 = Integer.parseInt(a.substring(i, i + 2), 16);
	            int n2 = Integer.parseInt(b.substring(i, i + 2), 16);
	            distance += (n1 - n2) * (n1 - n2);
	        }
	 
	        return distance;
	    }
	     public static void main(String[] args) {
	         Scanner sc = new Scanner(System.in);
	         System.out.println(similarRGB(sc.next()));
	     }
}
