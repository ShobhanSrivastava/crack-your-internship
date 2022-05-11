class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i] != 0){
                swap(nums, i, index++);
            }
        }
    }
    
    public void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}