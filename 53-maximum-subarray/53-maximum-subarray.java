class Solution {
    
    /*
        Using Kadane's algorithm
        
        - We start with the first element as the globalSum
        - We add the elements to the localSum as long as the localSum is positive
        - At each updation in the localSum, update the globalSum if the the localSum is greater than the globalSum
        - If at any point the localSum becomes less than or equal to 0, there is no point taking it further,
            because it will have no further contribution in the next subarray
        - Return the globalSum
    */
    public int maxSubArray(int[] nums) {
        int max=nums[0], sum=0;
        
        for(int i=0 ; i<nums.length ; i++){
            sum += nums[i];
            max = Math.max(sum, max);
            if(sum < 0){
                sum = 0;
            }
        }
        
        return max;
    }
}