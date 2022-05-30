class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        
        int paths = countPaths(n, dp);
        
        return paths;
    }
    
    public int countPaths(int n, int[] dp){
        if(n == 0){
            return 1;
        }
        else if(n < 0){
            return 0;
        }
        else{
            if(dp[n] > 0){
                return dp[n];
            }
            
            int nm1 = countPaths(n-1, dp);
            int nm2 = countPaths(n-2, dp);

            dp[n] = nm1 + nm2;

            return dp[n];   
        }
    }
}