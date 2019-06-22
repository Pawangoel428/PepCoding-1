package stackQueue;

import java.util.*;
public class stack_supporting_min_operation {


    static int minEle;
    static Stack<Integer> s=new Stack<>();
    
    //Complete the below 3 functions only
    static int getMin()
    {
    	if(s.isEmpty())
    		return -1;
    	return minEle;
    }
        
    static int pop()
    {
    	if(s.isEmpty())
    		return -1;
    	else
    	{
    		if(s.peek()>minEle)
    			return s.pop();
    		else
    		{
    			int temp = minEle;
    			minEle = 2*minEle-s.pop();
    			return (temp);
    		}
    	}
    }
    static void push(int x)
    {
    	if(s.isEmpty())
    	{
    		minEle = x;
    		s.push(x);
    	}
    	else
    	{
    		if(minEle<x)
    		{
    			s.push(x);
    		}
    		else
    		{
    			int temp = minEle;
    			minEle=x;
    			s.push(2*x-temp);
    		}
    	}
    }
    	 
	 // Dont make changes here    
	 public static void main(String[] args) {
	 	 // TODO Auto-generated method stub
	 	 Scanner sc=new Scanner(System.in);
	 	 int n=sc.nextInt();
	 	 int[] query=new int[n];
	 	 for(int i=0;i<n;i++){
	 	 	 query[i]=sc.nextInt();
	 	 }
	 	 int i=0;
	 	 while(i<n){
	 	 	 if(query[i]==1){
	 	 	 	 i++;
	 	 	 	 push(query[i]);
	 	 	 }
	 	 	 else if(query[i]==2){
	 	 	 	 System.out.println(pop());
	 	 	 }
	 	 	 else if(query[i]==3){
	 	 	 	 System.out.println(getMin());
	 	 	 }
	 	 	 i++;
	 	 }
	 }
}
