package stackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class rotation_of_cards {


    public static void cardRotation(int N) {
    	Queue<Integer> q = new LinkedList<Integer>();
    	for(int i=1;i<=N;i++)
    		q.add(i);
    	int count = 1;
    	int arr[] = new int[N];
    	while(!q.isEmpty())
    	{
    		for(int i=0;i<count;i++)
    			q.add(q.remove());
    		arr[q.remove()-1] = count;
    		count++;
    	}
    		
    	for(int i=0;i<N;i++)
    		System.out.println(arr[i]);
    }

    // Dont make changes here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        cardRotation(N);
    }
}
