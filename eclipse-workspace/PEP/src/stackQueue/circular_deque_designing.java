package stackQueue;

import java.util.*;

public class circular_deque_designing {

    static class CircularDeque {

    	  static public Deque<Integer> cdeque = new LinkedList<Integer>() ;
          static public int size ;

          public CircularDeque(int k) {
        	  size =  k ;                                                       
          }

          public boolean insertFront(int value) {
          	 if(cdeque.size()==size)
          		 return false;
          	 	cdeque.addFirst(value);
          	 	return true;
          	 
          }

          public boolean insertLast(int value) {
          	if(cdeque.size()==size)
      		 return false;
          	cdeque.addLast(value);
          	return true;
          	
          	
          }

          public boolean deleteFront() {
          	if(cdeque.isEmpty())
          		return false;
          	else
          	{cdeque.removeFirst();
          	return true;}
          }

          public boolean deleteLast() {
          	if(cdeque.isEmpty())
          		return false;
          	else
          	{cdeque.removeLast();
          	return true;}
          }

          public int getFront() {
          	if(cdeque.isEmpty())
          		return -1;
          	return cdeque.getFirst();
          }

          public int getRear() {
          	if(cdeque.isEmpty())
          		return -1;
          	return cdeque.getLast();

          }

          public boolean isEmpty() {
          	return cdeque.isEmpty();
          }

          public boolean isFull() {
          	if(cdeque.size()==size)
          		return true;
          	return false;
          }

      }

   

    // Dont make changes here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularDeque cd = new CircularDeque(sc.nextInt());
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int q = sc.nextInt();
            String s = "";
            if (q == 1) {
                s = "" + cd.insertFront(sc.nextInt());
            } else if (q == 0) {
                s = "" + cd.insertLast(sc.nextInt());
            } else if (q == 2) {
                s = "" + cd.deleteFront();
            } else if (q == -2) {
                s = "" + cd.deleteLast();
            } else if (q == 3) {
                s = "" + cd.getFront();
            } else if (q == -3) {
                s = "" + cd.getRear();
            } else if (q == 4) {
                s = "" + cd.isEmpty();
            } else if (q == 5) {
                s = "" + cd.isFull();
            }
            System.out.print(s + " ");
           
        }

    }

}
