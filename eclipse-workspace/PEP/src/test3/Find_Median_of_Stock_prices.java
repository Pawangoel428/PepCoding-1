package test3;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

import HashMapHeap.double_pair_array;

public class Find_Median_of_Stock_prices {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		int n = scn.nextInt();
		double arr ;
		for(int i=0;i<n;i++)
		{
			arr = scn.nextDouble();
			System.out.println(getMedian(arr));
		}
	}
	static PriorityQueue<Double> pq = new PriorityQueue<Double>(Collections.reverseOrder());
	private static double getMedian(double arr) {
		// TODO Auto-generated method stub
		pq.add(arr);
		int size = pq.size();
		Iterator<Double> value = pq.iterator();
		//System.out.println(size+"???????");
		if(size==1) return arr;
		else if(size%2!=0)
		{
			int i=0;
			while(i!=(size/2)+1)
			{
				System.out.println(i+"PP");
				value.next();
				i++;
			}
			//System.out.println(i+"PPPPPP");
			return  value.next();
		}
		else
		{
			int i=1;
			while(i!=(size/2))
			{
			//	//System.out.println(i+">>>>>>>");
				value.next();
				i++;
			}
			double sum = value.next();
			double sum2 = value.next()+sum;
			//System.out.println(sum+" "+sum2);
			return sum2/2;
		}
		
		
	}
}
