class Solution {
    
    /*
    The problem is divided into:
        - 1st house -> second last
        - 2nd house -> last
        
        We will calculate them separately and then return the max of the both
    */
    
    public int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        
        Integer[] dp1 = new Integer[nums.length];
        Integer[] dp2 = new Integer[nums.length];
        
        
        int firstLooted = maxLoot(nums, 0, false, nums.length-2, dp1);
        int firstNotLooted = maxLoot(nums, 1, false, nums.length-1, dp2);
        
        return Math.max(firstLooted, firstNotLooted);
    }
    
    public int maxLoot(int[] nums, int i, boolean prevLooted, int end, Integer[] dp){
        if(i > end){
            return 0;
        }
        
        if(prevLooted){
            return maxLoot(nums, i+1, false, end, dp);
        }
        
        if(dp[i] != null){
            return dp[i];
        }
        
        int loot = maxLoot(nums, i+1, true, end, dp);
        int notLoot = maxLoot(nums, i+1, false, end, dp);
        
        dp[i] = Math.max(loot+nums[i], notLoot);
        
        return dp[i];
    }
}