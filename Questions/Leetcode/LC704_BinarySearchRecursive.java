public class LC704_BinarySearchRecursive {
    public int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length-1);
    }
    
    public int binarySearch(int[] nums, int target, int start, int end){
        if(start > end){
            return -1;
        }
        
        int mid = end - (end-start)/2;
        
        if(target == nums[mid]){
            return mid;
        }
        else if(target < nums[mid]){
            return binarySearch(nums, target, start, mid-1);
        }
        else{
            return binarySearch(nums, target, mid+1, end);
        }
    }
}
