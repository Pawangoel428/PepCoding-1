package HashMapHeap;

import java.util.*;

public class tiger_zinda_hai {

	public static int open_closeTabs(String[] T) {
        //Write your code here
		HashSet<Integer> hs = new HashSet<Integer>();
		for(String s: T)
		{
			
			if(s.equals("END"))
			{hs.clear();}
			else
			{
				
				int n = Integer.parseInt(s);
				if(hs.contains(n))
					hs.remove(n);
				else
					hs.add(n);
			}
		}
		
		return hs.size();
    }

    //Dont make changes here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] T = new String[n];
        for (int i = 0; i < n; i++) {
            T[i] = sc.next();
        }
        System.out.println(open_closeTabs(T));
    }
}
