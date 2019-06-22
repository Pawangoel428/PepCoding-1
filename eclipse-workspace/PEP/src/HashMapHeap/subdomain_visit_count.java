package HashMapHeap;

import java.util.*;

public class subdomain_visit_count {

	static HashMap<String, Integer> hm = new HashMap<String, Integer>();
	 public static List<String> subdomainVisits(String[] cpdomains) {
	 	 //Write your code here
		
		 		for (int i = 0; i < cpdomains.length; i++) {
					
					String h[] = cpdomains[i].split("\\s+");
					int count =Integer.parseInt(h[0]);
					String words[] = h[1].split("\\.");
					String str = words[words.length-1];
					int c = hm.getOrDefault(str, 0);
					hm.put(str, c+count);
					for(int j = words.length-2;j>=0;j--)
					{
						//hm.put(str, count);
						str = words[j]+"."+str;
						//System.out.println(str);
						c = hm.getOrDefault(str, 0);
						hm.put(str, c+count);
					}
				}  
		 		
//			for(Map.Entry<String, Integer> hh :hm.entrySet())
//			{
//				 System.out.println("Key = " + hh.getKey() + 
//                         ", Value = " + hh.getValue()); 
//			}
			List<String> ans = new ArrayList<>();
	 	 	 for (String dom : hm.keySet())
	 	 	 	 ans.add("" + hm.get(dom) + " " + dom);
		 return ans;
	 	 	 }
	 public static void sortbykey() 
	    { 
	        // TreeMap to store values of HashMap 
	        TreeMap<String, Integer> sorted = new TreeMap<>(); 
	  
	        // Copy all data from hashMap into TreeMap 
	        sorted.putAll(hm); 
	  
	        // Display the TreeMap which is naturally sorted 
	        for (Map.Entry<String, Integer> entry : sorted.entrySet())  
	            System.out.println("Key = " + entry.getKey() +  
	                         ", Value = " + entry.getValue());         
	    } 
	 	 //Don't make any changes here
	 	 public static void main(String[] args) {
	 
	 	 	 Scanner s = new Scanner(System.in);
	 	 	 int n = Integer.parseInt(s.nextLine());
	 	 	 String[] cpd = new String[n];
	 	 	 for (int i = 0; i < cpd.length; i++) {
	 	 	 	 cpd[i] = s.nextLine();
	 	 	 }
	 	 	 List<String> ans = subdomainVisits(cpd);
	 	 	 Collections.sort(ans);
	 	 	 System.out.println(ans);
	 	 }
	 	 
}
