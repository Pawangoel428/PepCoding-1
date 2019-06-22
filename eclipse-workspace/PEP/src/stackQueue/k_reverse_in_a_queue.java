package stackQueue;

import java.util.*;

public class k_reverse_in_a_queue {

	 // of the Queue 
	 static void reverseQueueFirstKElements(Queue<Integer>queue, int k) { 
	 	 if (queue.isEmpty() == true || k > queue.size()) 
	 	 	 return; 
	 	 if (k <= 0) 
	 	 	 return; 

	 	 Stack<Integer> stack = new Stack<Integer>(); 

	 	 // Push the first K elements into a Stack 
	 	 for (int i = 0; i < k; i++) { 
	 	 	 stack.push(queue.peek()); 
	 	 	 queue.remove(); 
	 	 } 

	 	 
	 	 // Enqueue the contents of stack at the back 
	 	 // of the queue 
	 	 while (!stack.empty()) { 
	 	 	 queue.add(stack.peek()); 
	 	 	 stack.pop(); 
	 	 } 

	 	 
	 	 // Remove the remaining elements and enqueue 
	 	 // them at the end of the Queue 
	 	 for (int i = 0; i < queue.size() - k; i++) { 
	 	 	 queue.add(queue.peek()); 
	 	 	 queue.remove(); 
	 	 } 
                Print(queue);
	 } 

	 // Utility Function to print the Queue 
	 static void Print(Queue<Integer>queue) { 
	 	 while (!queue.isEmpty()) { 
	 	 	 System.out.print(queue.peek() + " "); 
	 	 	 queue.remove(); 
	 	 } 
	 } 

	 // Driver code 
	 public static void main(String args[]) {
	 	 Queue<Integer> q=new LinkedList<Integer>(); 
	 	 Scanner sc=new Scanner(System.in);
	 	 int n=sc.nextInt();
	 	 int k=sc.nextInt();
	 	 for(int i=0;i<n;i++)q.add(sc.nextInt());
	 	 reverseQueueFirstKElements(q, k);
	 }
}
