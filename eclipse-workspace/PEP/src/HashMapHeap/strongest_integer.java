package HashMapHeap;

import java.util.*;

public class strongest_integer {

	  public static void main(String[] args){
	         Scanner scn= new Scanner(System.in);
	         int x=scn.nextInt();
	         int y=scn.nextInt();
	         int bound=scn.nextInt();
	         ArrayList<Integer> ret = new ArrayList<>();
	         ret = powerfulIntegers( x, y, bound);
	         for(int i=0;i<ret.size();i++){
	             System.out.print(ret.get(i)+" ");
	         }
	     }
	     // -----------------------------------------------------
	 	 // This is a functional problem. Only this function has to be written.
	 	 // This function takes as input Integer x, y and bound.
	 	 // It should return an ArrayList of all powerfulIntegers 
	 	  public static ArrayList<Integer> powerfulIntegers(int x, int y, int bound) {
	 		 HashSet<Integer> seen = new HashSet<>();
 	         int xi = 1;
 	         for (int i = 0; i < 20 && xi <= bound; i++, xi *= x) {
 	             int yj = 1;
 	             for (int j = 0; j < 20 && xi + yj <= bound; j++, yj *= y)
 	                 if (xi + yj <= bound)
 	                     seen.add(xi + yj);
 	         }
 	         return new ArrayList<>(seen);
	      }
}
