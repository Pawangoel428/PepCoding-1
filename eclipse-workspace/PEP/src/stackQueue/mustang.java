package stackQueue;

import java.util.Scanner;

public class mustang {
	   public static boolean iscirclecomplete(int i,int[] petrol,int[] dist){
	  	  	  int d=i;
	  	  	  int petrem=0;
	  	  	  do{
	  	  	  	  petrem+=petrol[i]-dist[i];
	  	  	  	  if(petrem>=0){
	  	  	  	  	  i++;
	  	  	  	  }
	  	  	  	  if(petrem<0){
	  	  	  	  	  break;
	  	  	  	  }
	  	  	  	   if(i>=petrol.length){
	  	  	  	  	  i=0;
	  	  	  	  }
	  	  	  }while(d!=i);
	  	  	  if(petrem>=0)
	  	  	  	  return true;
	  	  	  else return false;
	  	  }
	      static int tour(int petrol[], int distance[])
	      {
	        for(int i=0;i<petrol.length;i++){
	  	  	  if(iscirclecomplete(i,petrol,distance)){
	  	  	  	  return i;
	  	  	  }
	  	  }
	  	  return -1;  
	      }
	  	  public static void main(String[] args) {
	  	  	  Scanner sc=new Scanner(System.in);
	  	  	  int n=sc.nextInt();
	  	  	  int[] petrol=new int[n];int[] dist=new int[n];
	  	  	  for(int i=0;i<n;i++)petrol[i]=sc.nextInt();
	  	  	  for(int i=0;i<n;i++)dist[i]=sc.nextInt();
	  	  	  System.out.println(tour(petrol,dist));
	  	  }
}
