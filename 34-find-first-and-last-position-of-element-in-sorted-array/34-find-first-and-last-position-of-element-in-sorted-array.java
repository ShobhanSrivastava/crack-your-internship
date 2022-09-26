class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0 || target < nums[0] || target > nums[nums.length-1]){
            return new int[]{-1,-1};
        }
        
        int first = first(nums, target);
        int last = last(nums, target);
        return new int[]{first, last};
    }
    
    public int first(int[] arr, int target){
        if(arr[0] == target){
            return 0;
        }
        
        int start = 0;
        int end = arr.length;
        
        while(start <= end){
            int mid = start + (end-start)/2;
            
            if(arr[mid] == target){
                if(arr[mid-1] != target){
                    return mid;
                }
                else{
                    end = mid-1;
                }
            }
            else{
                if(arr[mid]<target){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        
        return -1;
    }
    
    public int last(int[] arr, int target){
        if(arr[arr.length-1] == target){
            return arr.length-1;
        }
        
        int start = 0;
        int end = arr.length;
        
        while(start <= end){
            int mid = start + (end-start)/2;
            
            if(arr[mid] == target){
                if(arr[mid+1] != target){
                    return mid;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(arr[mid]<target){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        
        return -1;
    }
}