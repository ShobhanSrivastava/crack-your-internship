class Solution {
    public int minCostClimbingStairs(int[] cost) {
        Integer[] dp = new Integer[cost.length];
        int min0 = minCost(0, cost, dp);
        int min1 = minCost(1, cost, dp);
        
        return Math.min(min0, min1);
    }
    
    public int minCost(int step, int[] cost, Integer[] dp){
        if(step == cost.length){
            return 0;
        }
        
        if(dp[step] != null){
            return dp[step];
        }
        
        if(step+2 <= cost.length){
            dp[step] = Math.min(minCost(step+2, cost, dp), minCost(step+1, cost, dp));
            dp[step] += cost[step];
        }
        else{
            dp[step] = minCost(step+1, cost, dp) + cost[step];
        }
        
        return dp[step];
    }
}