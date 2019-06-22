package stackQueue;

import java.util.*;

public class unique_character {


    public static void uniqueChar(char[] str){
	 // Write your code here
    	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
    	Queue<Character> q = new LinkedList<Character>();
    	for(int i =0 ;i<str.length;i++)
    	{
    		if(hm.containsKey(str[i]))
    		{
    			hm.put(str[i], hm.get(str[i])+1);
    			while(!q.isEmpty()&&hm.get(q.peek())!=1)
    			{
    				q.remove();
    			}
    		}
    		else
    		{
    			hm.put(str[i], 1);
    			q.add(str[i]);
    		}
    		if(!q.isEmpty())
    			System.out.print(q.peek()+" ");
    		else
    			System.out.print("-1 ");
    	}
    	
	       
    }








    //Dont make changes here
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        	 
            int n=sc.nextInt();
            char ch[]=new char[n];

            for (int i=0; i<n;i++){
                ch[i]=sc.next().charAt(0);
                
            }
            uniqueChar(ch);


        

    }
}
