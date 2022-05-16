class Solution {
    public void sortColors(int[] nums) {
        int[] freq = new int[3];
        
        for(int n : nums){
            freq[n]++;
        }
        
        int index = 0;
        for(int i=0 ; i<freq.length ; i++){
            for(int j=1 ; j<=freq[i] ; j++){
                nums[index++] = i;
            }
        }
    }
}