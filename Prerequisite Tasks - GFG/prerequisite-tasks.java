//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
	public static void main(String args[]) throws IOException
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
		while(t>0)
		{
		    int N = sc.nextInt();
		    int P = sc.nextInt();
		    int prerequisites[][] = new int[P][2];
		    for(int i=0;i<P;i++)
		    {
		        for(int j=0;j<2;j++)
		        {
		            prerequisites[i][j] = sc.nextInt();
		        }
		    }
			Solution ob = new Solution();
			if(ob.isPossible(N,prerequisites))
			{
			    System.out.println("Yes");
			}
			else{
			    System.out.println("No");
			}
			t--;
		}
	}
	
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    public boolean isPossible(int N, int[][] prerequisites)
    {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for(int i=0 ; i<N ; i++) adjList.add(new ArrayList<>());
        
        for(int[] prerequisite : prerequisites) {
            int firstTask = prerequisite[1];
            int secondTask = prerequisite[0];
            
            adjList.get(firstTask).add(secondTask);
        }
        
        boolean[] visited = new boolean[N];
        boolean[] dfsVisited = new boolean[N];
        
        for(int node=0 ; node<N ; node++) {
            if(!visited[node]) {
                boolean hasCycle = dfs(node, adjList, visited, dfsVisited);
                if(hasCycle) return false;
            }
        }
        
        return true;
    }
    
    private boolean dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited, boolean[] dfsVisited) {
        visited[node] = true;
        dfsVisited[node] = true;
        
        for(int neighbor : adj.get(node)) {
            if(!visited[neighbor]) {
                if(dfs(neighbor, adj, visited, dfsVisited)) return true;
            }
            else if(dfsVisited[neighbor]) return true;
        }
        
        dfsVisited[node] = false;
        
        return false;
    }
    
}