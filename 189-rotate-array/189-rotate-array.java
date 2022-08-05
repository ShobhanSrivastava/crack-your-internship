class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        
        if(k >= len){
            k%=len;
        }
        
        int[] result = new int[len];
        
        for(int i=0 ; i<len-k ; i++){
            result[i+k] = nums[i];
        }
        
        int index = 0;
        for(int i=len-k ; i<len ; i++){
            result[index++] = nums[i];
        }
        
        for(int i=0 ; i<len ; i++){
            nums[i] = result[i];
        }
    }
}