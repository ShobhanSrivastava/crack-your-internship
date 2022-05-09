class Solution {
    public int findDuplicate(int[] nums) {
        cycleSort(nums);
        return nums[nums.length-1];
    }
    
    public void cycleSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            if(arr[i] != i+1 && arr[i] != arr[arr[i]-1]){
                swap(arr, i, arr[i]-1);
            }
            else{
                i++;
            }
        }
    }
    
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}