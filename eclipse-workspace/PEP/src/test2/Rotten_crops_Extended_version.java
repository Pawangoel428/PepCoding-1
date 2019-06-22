package test2;

import java.util.*;

public class Rotten_crops_Extended_version {
	 public static void main (String[] args) {
 	 	 //code
 	 	 Scanner sc=new Scanner(System.in);
 	 	     int r=sc.nextInt();int c=sc.nextInt();
 	 	     int[][] M=new int[r][c];
 	 	     for(int i=0;i<r;i++)
 	 	         for(int j=0;j<M[0].length;j++)
 	 	             M[i][j]=sc.nextInt();
 	 	     System.out.println(rottenOranges(M));
 	 	 
 	 }
 	 static class Pair{
 	     int i, j;
 	     Pair(int i, int j){
 	         this.i=i;this.j=j;
 	     }
 	 }
 	 public static int rottenOranges(int[][] M){
 	     int time=-1;// Sources are rotten at t=0 
 	     LinkedList<Pair>queue=new LinkedList<>();
 	     for(int i=0;i<M.length;i++)
 	         for(int j=0;j<M[0].length;j++)
 	             if(M[i][j]==2)queue.addLast(new Pair(i, j));
 	     queue.add(null);
 	     
 	     while(queue.size()!=0){
 	         //remove
 	         Pair rp=queue.removeFirst();
 	        
 	         if(rp==null){
 	             if(queue.size()!=0)
 	                 queue.addLast(null);
 	            time++;continue;
 	         }
 	         
 	        int i=rp.i, j=rp.j;
 	        if(M[i][j]==3) time+=0.5;
 	        else if(M[i][j]==2) time++;
 	         //mark
 	         // Lets take 3 for visited
 	         if(M[i][j]==4)continue;
 	         M[i][j]=4;
 	         //add children
 	         if(isValid(M, i-1, j))queue.addLast(new Pair(i-1, j));
 	         if(isValid(M, i, j+1))queue.addLast(new Pair(i, j+1));
 	         if(isValid(M, i+1, j))queue.addLast(new Pair(i+1, j));
 	         if(isValid(M, i, j-1))queue.addLast(new Pair(i, j-1));
 	     }
 	     
 	     for(int m=0;m<M.length;m++)
 	         for(int n=0;n<M[0].length;n++)
 	             if(M[m][n]==1)return -1;
 	    
 	    return time;
 	 }
 	 public static boolean isValid(int[][] M, int i, int j){
 	     return (i>=0 && i<M.length && j>=0 && j<M[0].length && M[i][j]!=3 && M[i][j]!=0);
 	 }
 
    
}
