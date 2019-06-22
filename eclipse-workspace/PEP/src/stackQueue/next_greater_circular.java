package stackQueue;

import java.util.*;

public class next_greater_circular {

	 public static int[] nextGreaterCircularInManner(int[] nums,int n) {
		 Stack<Integer> st = new Stack<Integer>();
		 int ans[] = new int[n];
		 int db[] = new int[2*n];
		 for(int i=0;i<nums.length;i++)
		 {
			 db[i]=nums[i];
			 db[n+i] = nums[i];
		 }
		 for(int i = db.length-1; i>=0;i--)
		 {
			 while(!st.isEmpty()&&st.peek()<=db[i])
				 st.pop();
		if(i<n+1){ if(st.isEmpty())
				ans[i]=-1;
			 else
				 ans[i]=st.peek();}
		st.push(db[i]);
		 }
		 return ans;
     }
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int n=sc.nextInt();
         int[] nums=new int[n];
         for(int i=0;i<n;i++){
             nums[i]=sc.nextInt();
         }
         int[] res=nextGreaterCircularInManner(nums,n);
         for(int i=0;i<res.length;i++)
             System.out.print(res[i]+" ");
     }
}
