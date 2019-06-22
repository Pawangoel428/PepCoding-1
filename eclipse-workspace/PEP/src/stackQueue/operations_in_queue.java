package stackQueue;

import java.util.*;

public class operations_in_queue {

	static Queue<Integer> q = new LinkedList<Integer>();
	static HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    static void insert(Queue<Integer> q, int k){
    	q.add(k);
    	if(hm.containsKey(k))
    		hm.put(k, hm.get(k)+1);
    	else 
    		hm.put(k, 1);
    }
    static int findFrequency(Queue<Integer> q, int k){
    	if(hm.get(k)!=null)
    		return hm.get(k);
    	else 
    		return -1;
    }
    
    //Dont make changes here
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<n;i++)insert(q, sc.nextInt());
        for(int i=0;i<m;i++)
            System.out.print(findFrequency(q, sc.nextInt())+" ");
    }
}
