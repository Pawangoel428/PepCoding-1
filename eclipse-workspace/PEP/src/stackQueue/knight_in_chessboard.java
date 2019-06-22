package stackQueue;

import java.util.ArrayList;
import java.util.Scanner;

public class knight_in_chessboard {

	 // Class for storing a cell's data 
	 static class cell 
	 { 
	 	 int x, y; 
	 	 int dis; 
	 
	 	 	 public cell(int x, int y, int dis) 
	 	 	 { 
	 	 	 	 this.x = x; 
	 	 	 	 this.y = y; 
	 	 	 	 this.dis = dis; 
	 	 	 } 
	 	 
	 	 
	 } 
	 
	 // Utility method returns true if (x, y) lies 
	 // inside Board 
	 static boolean isInside(int x, int y, int N) 
	 { 
	 	 if (x >= 1 && x <= N && y >= 1 && y <= N) 
	 	 	 return true; 
	 	 return false; 
	 } 
	 
	 // Method returns minimum step 
	 // to reach target position 
	 static int knightChessboard(int knightPos[], int targetPos[], int N) 
	 { 
	 	 // x and y direction, where a knight can move 
	 	 int dx[] = {-2, -1, 1, 2, -2, -1, 1, 2}; 
	 	 int dy[] = {-1, -2, -2, -1, 1, 2, 2, 1}; 
	 	 ArrayList<cell> q = new ArrayList<cell>();
	 	 
	 	 q.add(new cell(knightPos[0],knightPos[1],0));
	 	 cell t ; 
	 	 int x, y; 
	 	 boolean visit[][] = new boolean[N+1][N+1]; 
	 	 for(int i=0;i<=N;i++)
	 		 for(int j=0;j<=N;j++)
	 			 visit[i][j]=false;
	 	visit[knightPos[0]][knightPos[1]] = true; 
	 	
	 	while(!q.isEmpty())
	 	{
	 		t  =  q.get(0);
	 		q.remove(0);
	 		if(t.x==targetPos[0]&&t.y==targetPos[1])
	 			return t.dis;
	 		for(int i =0;i<8;i++)
	 		{
	 			x = t.x+dx[i];
	 			y = t.y+dy[i];
	 			
	 			if(isInside(x, y, N)&&!visit[x][y])
	 			{
	 				visit[x][y]=true;
	 				q.add(new cell(x,y,t.dis+1));
	 			}
	 			
	 		}
	 	}
	 	return Integer.MAX_VALUE ; 
	 }
	 // Driver code 
	 public static void main(String[] args) 
	 {       Scanner sc=new Scanner(System.in);
	 	 int N = sc.nextInt(); 
	 	 int knightPos[] = new int[2]; 
	 	 int targetPos[] = new int[2];
	         knightPos[0]=sc.nextInt();knightPos[1]=sc.nextInt();
	         targetPos[0]=sc.nextInt();targetPos[1]=sc.nextInt();
	 	 	 System.out.println(knightChessboard(knightPos, targetPos, N)); 
	 	 } 
}
