class Solution {
    public int removeDuplicates(int[] nums) {
        int currElement = nums[0];
        int index = 1;
        for(int i=1 ; i<nums.length ; i++){
            if(nums[i] != currElement){
                nums[index++] = nums[i];
                currElement= nums[i];
            }
        }
        
        return index;
    }
}