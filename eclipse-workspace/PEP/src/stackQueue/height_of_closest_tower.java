package stackQueue;

import java.util.*;

public class height_of_closest_tower {

	 public static int heightClosestTower(int[] A){
	 // Write your code here
		 Stack<Integer> st = new Stack<Integer>();
		 int sum =0;
		 for(int i =A.length-1;i>=0;i--)
		 {
			 while(!st.isEmpty()&&st.peek()<=A[i])
				 st.pop();
			 if(st.isEmpty())
			 {}
			 else
			 { sum+=st.peek();}
			 st.push(A[i]);
		 }
		 return sum;
        }

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // Dont make changes here
        public static void main (String[] args) {
	 
            Scanner sc=new Scanner(System.in);
            int N=sc.nextInt();
            int[] A=new int[N];
            for(int i=0;i<N;i++)A[i]=sc.nextInt();
            System.out.println(heightClosestTower(A));
	 
        }	 
	 
}
