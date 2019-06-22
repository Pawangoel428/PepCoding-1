package stackQueue;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class fleet_of_cars {
	   public static int carFleet(int target, int[] position, int[] speed) {
		   if(position.length==0) return 0;
		   int fleet = 0;
		   int time[] = new int[position.length];
		   
		   
		   TreeMap<Integer, Integer> hm = new TreeMap<Integer, Integer>();
		   
		   for(int i=0;i<position.length;i++)
			   hm.put(position[i], speed[i]);
		   
		   int i=position.length-1;
		   for (Entry<Integer, Integer> entry : hm.entrySet())  
	            {position[i] = entry.getKey();  
	             speed[i] = entry.getValue();
	             time[i]=(target - position[i])/speed[i];
	             System.out.println(position[i]+"->"+speed[i]+"->"+time[i]);
	             i--;
	            }; 
	        
	       i = position.length-1;
	       int t = time[position.length-1];
		   while(i!=0)
		   {
			   if(time[i]>=t)
				   {System.out.println(position[i]);fleet++;}
	
			   i--;
		   }
		   return fleet;
		   
		     } 
		     
		     
		     // Dont make changes here
		     public static void main(String[] args){
		         Scanner sc=new Scanner(System.in);
		         int target=sc.nextInt();
		         int n=sc.nextInt();
		         int[] pos=new int[n];
		         int[] speed=new int[n];
		         for(int i=0;i<n;i++)pos[i]=sc.nextInt();
		         for(int i=0;i<n;i++)speed[i]=sc.nextInt();
		         System.out.println(carFleet(target, pos, speed));
		     }
}
