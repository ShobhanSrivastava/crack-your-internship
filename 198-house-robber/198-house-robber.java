class Solution {
    public int rob(int[] nums) {
        Integer[] dp = new Integer[nums.length];
        int max = maxLoot(nums, 0, false, dp);
        
        return max;
    }
    
    public int maxLoot(int[] nums, int i, boolean prevLooted, Integer[] dp){
        if(i == nums.length){
            return 0;
        }
        
        //If previous house is looted -> don't loot
        if(prevLooted){
            return maxLoot(nums, i+1, false, dp);
        }
        
        if(dp[i] != null){
            return dp[i];
        }
        
        //If previous house is not looted -> loot or don't loot
        int loot = maxLoot(nums, i+1, true, dp) + nums[i]; //loot and add the cash
        int notLoot = maxLoot(nums, i+1, false, dp); //Dont loot and check further
        
        dp[i] = Math.max(loot, notLoot);
        
        return dp[i];
    }
}