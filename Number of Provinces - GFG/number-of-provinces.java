//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int V = Integer.parseInt(read.readLine());
            
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            
            for(int i=0; i<V; i++)
            {
                String S[] = read.readLine().split(" ");
                ArrayList<Integer> temp = new ArrayList<>();
                for(int j=0; j<V; j++)
                    temp.add(Integer.parseInt(S[j]));
                adj.add(temp);
            }

            Solution ob = new Solution();
            System.out.println(ob.numProvinces(adj,V));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        boolean[] visited = new boolean[V];
        
        int provinceCount = 0;
        
        for(int i=0 ; i<V ; i++){
            if(!visited[i]) {
                provinceCount++;
                findNeighbours(i, visited, adj, V);
            }
        }
        
        return provinceCount;
    }
    
    static void findNeighbours(int city, boolean[] visited, ArrayList<ArrayList<Integer>> adj, int V){
        visited[city] = true;
        for(int i=0 ; i<V ; i++){
            if(adj.get(city).get(i) == 1 && !visited[i]){
                findNeighbours(i, visited, adj, V);
            }
        }
    }
};