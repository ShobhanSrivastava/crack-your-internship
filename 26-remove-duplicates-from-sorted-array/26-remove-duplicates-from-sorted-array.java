class Solution {
    public int removeDuplicates(int[] nums) {
        int current = nums[0], index = 1;
        for(int i=1 ; i<nums.length ; i++){
            if(nums[i] != current){
                current = nums[i];
                nums[index++] = current;
            }
        }
        return index;
    }
}