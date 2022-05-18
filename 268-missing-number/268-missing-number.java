class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int sum = len * (len+1)/2;
        
        int i=0;
        while(i<len){
            sum -= nums[i];
            i++;
        }
        
        return sum;
    }
}