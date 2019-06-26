package test3;

import java.util.HashSet;
import java.util.*;

public class CountSubarray {

	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
 
		int n = s.nextInt();
		Random rand = new Random();
		Integer arr[] = new Integer[n];
		Map<Integer, Long> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
			long hash;
			if (map.containsKey(arr[i])) {
				hash = map.get(arr[i]);
			} else {
				hash = arr[i] * rand.nextLong();
				map.put(arr[i], hash);
			}
		}
 
		HashSet<Long> set = new HashSet<>();
 
		for (int i = 0; i < n; i++) {
			HashSet<Integer> subset = new HashSet<>();
			long sum = 0;
			for (int j = i; j < n; j++) {
				long hash = map.get(arr[j]);
 
				if (!subset.contains(arr[j])) {
					sum += hash;
					set.add(sum);
					subset.add(arr[j]);
				}
 
			}
		}
 
		System.out.println(set.size());
 
	}
	

}

