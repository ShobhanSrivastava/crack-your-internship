class Solution {
    public int[] sortArray(int[] nums) {
        int len = nums.length;
        
        if(len == 1){
            return nums;
        }
        
        int[] left = sortArray(Arrays.copyOfRange(nums, 0, len/2));
        int[] right = sortArray(Arrays.copyOfRange(nums, len/2, len));
        
        return mergeArray(left, right);
    }
    
    public int[] mergeArray(int[] arr1, int[] arr2){
        int len1 = arr1.length;
        int len2 = arr2.length;
        
        int[] merged = new int[len1+len2];
        
        int i=0, j=0, k=0;
        
        while(i<len1 && j<len2){
            if(arr1[i] <= arr2[j]){
                merged[k++] = arr1[i++];
            }
            else{
                merged[k++] = arr2[j++];
            }
        }
        
        while(i<len1){
            merged[k++] = arr1[i++];
        }
        
        while(j<len2){
            merged[k++] = arr2[j++];
        }
        
        return merged;
    }
}