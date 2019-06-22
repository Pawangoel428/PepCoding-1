package stackQueue;

import java.util.*;

import stackQueue.knight_in_chessboard.cell;

public class rotten_crops_in_a_farm {

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
	 static boolean isInside(int x, int y, int r , int c) 
	 { 
	 	 if (x >= 1 && x <= r && y >= 1 && y <= c) 
	 	 	 return true; 
	 	 return false; 
	 } 
	 
	 public static int rottenOranges(int[][] M,int r,int c){
	 	 // Write your code here
		 int dx[] = {1,-1,0,0}; 
	 	 int dy[] = {0,0,1,-1}; 
	 	 ArrayList<cell> q = new ArrayList<cell>();
	 	 
	 	 
	 	 cell t ; 
	 	 int x, y; 
	 	 boolean visit[][] = new boolean[r+1][c+1]; 
	 	for(int i=0;i<=r;i++)
	 		 for(int j=0;j<=c;j++)
	 			 visit[i][j]=false;
	 	 for(int i = 0;i<r;i++)
	 		 for(int j=0;j<c;j++)
	 		 {
	 			 if(M[i][j]==2)
	 				 {q.add(new cell(i,j,0));visit[i][j]=true;}
	 		 }
	 	 int count = 0;
	 	while(!q.isEmpty())
	 	{
	 		t  =  q.get(0);
	 		q.remove(0);
	 		
	 		for(int i =0;i<4;i++)
	 		{
	 			x = t.x+dx[i];
	 			y = t.y+dy[i];
	 			
	 			if(isInside(x, y, r-1, c-1))
 					M[x][y]= 2;
	 			if(isInside(x, y, r,c)&&!visit[x][y])
	 			{
	 				visit[x][y]=true;
	 				q.add(new cell(x,y,t.dis+1));
	 				count = count<t.dis+1?t.dis:count;
	 			}
	 			
	 		}
	 	}
	 	for(int i = 0;i<r;i++)
	 	{ for(int j=0;j<c;j++)
	 		 {
	 			if(M[i][j]==1&&visit[i][j])
	 				return -1;
	 				// System.out.print(M[i][j]);
	 			 
	 		 }
	 	}
	 	
	 	 return count;
	 	 }  
	 
	 
	 
	 	 // Dont make changes here
	 	 public static void main (String[] args) {
	 	 	 //code
	 	 	 Scanner sc=new Scanner(System.in);
	 	 	 int r=sc.nextInt();int c=sc.nextInt();
	 	 	 int[][] M=new int[r][c];
	 	 	 for(int i=0;i<r;i++)
	 	 	 	 for(int j=0;j<M[0].length;j++)
	 	 	         	 M[i][j]=sc.nextInt();
	 	 	 System.out.println(rottenOranges(M,r,c));
	 	 	 
	 	 }
	
}
