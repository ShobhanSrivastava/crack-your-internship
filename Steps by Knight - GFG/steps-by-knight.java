//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int N = Integer.parseInt(br.readLine().trim());
            String[] S1 = br.readLine().trim().split(" ");
            String[] S2 = br.readLine().trim().split(" ");
            int[] KnightPos = new int[2];
            int[] TargetPos = new int[2];
            for(int i = 0; i < 2; i++){
                KnightPos[i] = Integer.parseInt(S1[i]);
                TargetPos[i] = Integer.parseInt(S2[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minStepToReachTarget(KnightPos, TargetPos, N);
            System.out.println(ans);
       }
    }
}

// } Driver Code Ends


class Solution
{
    // This function takes the current row and col of the knight and tells if the position is a valid position on the board
    private boolean isValidPos(int newRow, int newCol, int boardSize) {
        if(newRow < 0 || newRow >= boardSize || newCol < 0 || newCol >= boardSize) return false;
        
        return true;
    }
    
    int[][] posChanges = {{-2, -1}, {-2, 1}, {2, -1}, {2, 1}, {-1, -2}, {1, -2}, {-1, 2}, {1, 2}};
    
    //Function to find out minimum steps Knight needs to reach target position.
    public int minStepToReachTarget(int KnightPos[], int TargetPos[], int N)
    {
        boolean[][] visited = new boolean[N][N];
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{KnightPos[0]-1, KnightPos[1]-1, 0});
        
        while(!queue.isEmpty()) {
            int[] currentPos = queue.poll();
            int row = currentPos[0], col = currentPos[1], steps = currentPos[2];
            
            if(row == TargetPos[0]-1 && col == TargetPos[1]-1) return steps;
            
            if(visited[row][col]) continue;
            visited[row][col] = true;
            
            for(int i=0 ; i<8 ; i++) {
                int newRow = row + posChanges[i][0];
                int newCol = col + posChanges[i][1];
                
                if(isValidPos(newRow, newCol, N) && !visited[newRow][newCol]) {
                    queue.offer(new int[]{newRow, newCol, steps+1});
                }
            }
        }
        
        return -1;
    }
}