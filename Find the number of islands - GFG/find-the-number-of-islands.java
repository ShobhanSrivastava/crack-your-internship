//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int islandCount = 0;
        
        for(int i=0 ; i<rows ; i++) {
            for(int j=0 ; j<cols ; j++) {
                if(!visited[i][j] && grid[i][j] == '1') {
                    dfs(i, j, visited, grid, rows, cols);
                    islandCount++;
                }
            }
        }
        
        return islandCount;
    }
    
    int[][] posChanges = {{0, -1}, {-1, 0}, {0, 1}, {1, 0}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};
    
    private boolean isValidPos(int row, int col, int totalRows, int totalCols) {
        if(row < 0 || row >= totalRows) return false;
        if(col < 0 || col >= totalCols) return false;
        
        return true;
    }
    
    //Function to traverse all the connected 1s using DFS strategy
    private void dfs(int currRow, int currCol, boolean[][] visited, char[][] grid, int rows, int cols) {
        visited[currRow][currCol] = true;
        
        for(int i=0 ; i<8 ; i++) {
            int newRow = currRow + posChanges[i][0];
            int newCol = currCol + posChanges[i][1];
            
            if(isValidPos(newRow, newCol, rows, cols) && !visited[newRow][newCol] && grid[newRow][newCol] == '1'){
                dfs(newRow, newCol, visited, grid, rows, cols);
            }
        }
    }
}