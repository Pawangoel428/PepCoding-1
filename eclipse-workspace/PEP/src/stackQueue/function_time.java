package stackQueue;

import java.util.*;

public class function_time {

	static class Node{
		int number;
		int startTime;
		int notMyTime;
		public Node(int number,int startTime,int notmytime) {
			// TODO Auto-generated constructor stub
			this.notMyTime = notmytime;
			this.startTime = startTime;
			this.number = number;
		}
	}
    public static int[] exclusiveTime(int n, List<String> logs) {
    // Write your code here
    	Stack<Node> st = new Stack<Node>();
    	int sol[] = new int[n];
    	 for(int i=0;i<logs.size();i++)
    	{
    		String str[] = logs.get(i).split(":", -1);
    		int d = Integer.parseInt(str[0]);
    		boolean op = str[1].equals("start")?true:false;
    		int startTime = Integer.parseInt(str[2]);
    		//System.out.print(str[1] + op);
    		if(op)
    		{
    			Node n1 = new Node(d,startTime,0);
    			st.push(n1);
    			//System.out.println("push");
    		}
    		else
    		{
    			Node n1 = st.pop();
    			
    			sol[d] = startTime - n1.startTime + 1 - n1.notMyTime;
    			//if(startTime==n1.startTime) sol[d] = sol[d]-1;
    			if(!st.isEmpty())
    			{
    			Node n2 = st.pop();
    			n2.notMyTime = n2.notMyTime+startTime - n1.startTime+1;
    			//if(startTime==n1.startTime) n2.notMyTime = n2.notMyTime-1;
    			st.push(n2);
    			}	
    			//System.out.println(sol[d] +" "+(startTime - n1.startTime)+" "+n1.notMyTime);
    		}
    	}
    	return sol;
    }
    
    
    // Dont make changes here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int L = sc.nextInt();
        List<String> logs = new ArrayList<>(L);
        for (int i = 0; i < L; i++) {
            logs.add(sc.next());
        }
        int[] res = exclusiveTime(n, logs);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
