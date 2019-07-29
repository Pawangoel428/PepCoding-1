package dp;

import java.util.*;

	public class Graph { 
		  
	    // No. of vertices in graph 
	    private int v;  
	      
	    // adjacency list  
	    private ArrayList<Integer>[] adjList;  
	      
	    //Constructor 
	    public Graph(int vertices){ 
	          
	        //initialise vertex count 
	        this.v = vertices; 
	          
	        // initialise adjacency list 
	        initAdjList();  
	    } 
	      
	    // utility method to initialise 
	    // adjacency list 
	    @SuppressWarnings("unchecked") 
	    private void initAdjList() 
	    { 
	        adjList = new ArrayList[v]; 
	          
	        for(int i = 0; i < v; i++) 
	        { 
	            adjList[i] = new ArrayList<>(); 
	        } 
	    } 
	      
	    // add edge from u to v 
	    public void addEdge(int u, int v) 
	    { 
	        // Add v to u's list. 
	        adjList[u].add(v);  
	    } 
	      
	    // Prints all paths from 
	    // 's' to 'd' 
	    public void printAllPaths(int s, int d)  
	    { 
	        boolean[] isVisited = new boolean[v]; 
	        ArrayList<Integer> pathList = new ArrayList<>(); 
	          
	        //add source to path[] 
	        pathList.add(s); 
	        count = 0;
	        //Call recursive utility 
	        printAllPathsUtil(s, d, isVisited, pathList); 
	        System.out.print(count+" ");
	    } 
	  
	    // A recursive function to print 
	    // all paths from 'u' to 'd'. 
	    // isVisited[] keeps track of 
	    // vertices in current path. 
	    // localPathList<> stores actual 
	    // vertices in the current path 
	    static int count = 0;
	    private void printAllPathsUtil(Integer u, Integer d, 
	                                    boolean[] isVisited, 
	                            List<Integer> localPathList) { 
	          
	        // Mark the current node 
	        isVisited[u] = true; 
	          
	        if (u.equals(d))  
	        { 
	           // System.out.println(localPathList); 
	            if(localPathList.size()%2==0)
	            	count++;
	           
	            // if match found then no need to traverse more till depth 
	            isVisited[u]= false; 
	            return ; 
	        } 
	          
	        // Recur for all the vertices 
	        // adjacent to current vertex 
	        for (Integer i : adjList[u])  
	        { 
	            if (!isVisited[i]) 
	            { 
	                // store current node  
	                // in path[] 
	                localPathList.add(i); 
	                printAllPathsUtil(i, d, isVisited, localPathList); 
	                  
	                // remove current node 
	                // in path[] 
	                localPathList.remove(i); 
	            } 
	        } 
	          
	        // Mark the current node 
	        isVisited[u] = false; 
	    }
	    
	
	
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int test = s.nextInt();
		
		for(int i =0;i<test;i++)
		{
			
			int node = s.nextInt();
			int edegs = s.nextInt();
			int source = s.nextInt();
			Graph g = new Graph(node); 
			for(int j = 0;j<edegs;j++)
			{
				int s1 = s.nextInt();
				int s2 = s.nextInt();
				g.addEdge(s1-1, s2-1);
			}
			
			for(int j = 1;j<=node;j++)
			{ // System.out.println(source+" "+j);
				g.printAllPaths(source-1, j-1);
			} 
			s.nextLine();
			//s.nextLine();
			System.out.println();
			
		}
		//System.out.println("\n");
	}
}

