class Solution {
    public boolean canJump(int[] nums) {
        int jump = 1;
        for(int i=0 ; i<nums.length ; i++){
            jump = Math.max(jump-1, nums[i]);
            
            if(i+jump >= nums.length-1){
                return true;
            }
            
            if(jump <= 0){
                break;
            }
        }
        
        return false;
    }
}