package HashMapHeap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class is_contiguous_array_duplicacy {

	  public static boolean isContiguous(int[] arr) {
	  	  //Write your Code here
		  HashSet<Integer> hs = new HashSet<Integer>();
		  int max = arr[0],min = arr[0];
		  for(int i=0;i<arr.length;i++)
		  {
			  if(!hs.contains(arr[i])) hs.add(arr[i]);
			  max = max>arr[i]?max:arr[i];
			  min = min<arr[i]?min:arr[i];
		  }
		  for(int i = min;i<=max;i++)
		  {
			  if(!hs.contains(i)) return false;
		  }
		  return true;
	  }

	  //Don't make changes here
	  public static void main(String[] args) throws IOException {
	  	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  	  int n = Integer.parseInt(br.readLine());
	  	  String[] s = br.readLine().split(" ");
	  	  int[] num = new int[n];
	  	  for (int i = 0; i < n; i++) {
	  	  	  num[i] = Integer.parseInt(s[i]);
	  	  }
	  	  boolean bl = isContiguous(num);
	  	  System.out.println(bl);
	  }
}
