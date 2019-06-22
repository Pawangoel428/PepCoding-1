package test2;

import java.util.Scanner;

public class Virus {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		int n[] = new int[num];
		for(int i=0;i<num;i++)
		{
			n[i] = sc.nextInt();
		}
		System.out.println(VirusDaySpread(n));
	}

	private static int VirusDaySpread(int[] n) {
		int count =0;
		for(int i = 0;i<n.length;i++)
		{
			for(int j=i;j>=0;j--)
			{
				if(n[i]<n[j])
				{
					if(count<(i-j))
						{count = i-j;System.out.println(n[i]+" "+count);break;}
					
				}
			}
		}
		return count;
	}
	
}
