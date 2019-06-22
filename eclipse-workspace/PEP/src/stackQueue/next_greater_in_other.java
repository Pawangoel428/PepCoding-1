package stackQueue;

import java.util.*;

public class next_greater_in_other {

	 public static int[] nextGreaterOther(int[] nums1, int[] nums2,int n1,int n2) {
	 	 // Write your code here	
		 Stack<Integer> st = new Stack<Integer>();
		 HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>(); 
		 int ans[] = new int[n1];
		 for(int i =n2-1;i>=0;i--)
		 {
			 while(!st.isEmpty()&&st.peek()<=nums2[i])
				 st.pop();
			 if(st.isEmpty())
				 hm.put(nums2[i], -1);
			 else
				 {if(!hm.containsKey(nums2[i]))
				 hm.put(nums2[i], st.peek());}
			 st.push(nums2[i]);
		 }
		 for(int i=0;i<n1;i++)
		 {
			 ans[i] = hm.get(nums1[i]);
		 }
		 
		 return ans;
	 	 }
	 	 
	 	 // Dont make changes here
	 	 public static void main(String[] args) {
	 	 	 // TODO Auto-generated method stub
	 	 	 Scanner sc=new Scanner(System.in);
	 	 	 int n1=sc.nextInt(), n2=sc.nextInt();
	 	 	 int[] nums1=new int[n1]; int[] nums2=new int[n2];
	 	 	 for(int i=0;i<n1;i++)nums1[i]=sc.nextInt();
	 	 	 for(int i=0;i<n2;i++)nums2[i]=sc.nextInt();
	 	 	 int[] res=nextGreaterOther(nums1, nums2,n1,n2);
	 	 	 for(int i=0;i<n1;i++)System.out.print(res[i] + " ");
	 	 }
	 
}
