class Solution {
    public int search(int[] nums, int target) {
        int pivot = 0;
        
        for(int i=1 ; i<nums.length ; i++){
            if(nums[i] < nums[i-1]){
                pivot = i;
                break;
            }
        }
        
        if(nums[pivot] == target){
            return pivot;
        }
        
        int start = 0;
        int end = nums.length-1;
        
        
        if(target > nums[pivot] && target <= nums[end]){
            return binarySearch(nums, pivot+1, end, target);
        }
        else{
            return binarySearch(nums, start, pivot-1, target);
        }
    }
    
    public int binarySearch(int[] nums, int start, int end, int target){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        
        return -1;
    }
}