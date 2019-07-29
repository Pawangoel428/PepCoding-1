package dp;

import java.util.Scanner;

public class Ugly_Numbers {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	System.out.println(Ugly(n));
}

private static int Ugly(int n) {
	// TODO Auto-generated method stub
	if(n<1)
		return n;
	int num = 1;
	int n2  = 2,n3 = 3,n5 = 5;
	int s2=0,s3=0,s5=0;
	for(int i=0;i<n-1;i++)
	{
		num = Integer.min(n2, Integer.min(n3, n5));
		if(num==n2)
		{
			s2++;
			n2=s2*2;
		}
		if(num==n3)
		{
			s3++;
			n3=s3*3;
		}
		if(num==n5)
		{
			s5++;
			n5=s5*5;
		}
		
	System.out.println(num);
	}
	return num;
}


}
