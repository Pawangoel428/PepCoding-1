package stackQueue;

import java.util.*;

public class number_of_fetches {
	 // Complete the functions
	 static class RecentFetch {
		 Queue<Integer> q = new LinkedList<Integer>();
		 int count = 0;
    	 public int ping(int t) {
    		 
    		 while(!q.isEmpty()&&q.peek()<(t-3000))
    		 {
    		  q.remove();
    		  count--;
    		 };
    		 q.add(t);
    		 count++;
    		 return count;
    	 }  
}










	 // Dont make changes here 
	 public static void main(String[] args){
	 	 RecentFetch rf=new RecentFetch();
	 	 Scanner sc=new Scanner(System.in);
	 	 int n=sc.nextInt();
	 	 for(int i=0;i<n;i++){
	 	 	 System.out.print(rf.ping(sc.nextInt())+" ");
	 	 }
	 }

}
