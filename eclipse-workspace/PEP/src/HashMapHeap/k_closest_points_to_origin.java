package HashMapHeap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class k_closest_points_to_origin {

	static class Point {
		int x;
		int y;

		public Point(int x, int y) {
			// TODO Auto-generated constructor stub
			this.x = x;
			this.y = y;
		}

	}

	public static int[][] kClosest(int[][] points, int K) {
		// Write your code here
		PriorityQueue<Point> pq = new PriorityQueue<Point>(new Comparator<Point>() {

			@Override
			public int compare(Point o1, Point o2) {
				// TODO Auto-generated method stub
				int dist1 = (o1.x * o1.x) + (o1.y * o1.y);
				int dist2 = (o2.x * o2.x) + (o2.y * o2.y);

				return dist1 - dist2;
			}
		});

		for (int i = 0; i < points.length; i++) {
			pq.add(new Point(points[i][0], points[i][1]));
		}
		int arr[][] = new int[K][2];
		for (int i = 0; i < K; i++) {
			Point p = pq.remove();
			arr[i][0] = p.x;
			arr[i][1] = p.y;
		}
		return arr;
	}
	     public static void main(String[] args){
	         Scanner scn= new Scanner(System.in);
	         int row=scn.nextInt();
	         int[][] points= new int[row][2];
	         for(int i=0;i<row;i++){
	             for(int j=0;j<2;j++){
	                 points[i][j]=scn.nextInt();
	             }
	         }
	         int k= scn.nextInt();
	         int[][] res=kClosest(points,k);
	         for(int i=0;i<res.length;i++){
	             for(int j=0;j<2;j++)
	                 System.out.print(res[i][j]+" ");
	 	 	 	 System.out.println();
	         }
	     }
}
