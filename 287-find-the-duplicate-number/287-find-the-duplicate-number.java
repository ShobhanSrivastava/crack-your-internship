class Solution {
    public int findDuplicate(int[] nums) {
        cycleSort(nums);
        return nums[nums.length-1];
    }
    
    public void cycleSort(int[] arr){
        int i=0;
        while(i<arr.length){
            if(i == arr[i]-1){
                i++;
            }
            else{
                swap(arr, i, arr[i]-1);
                if(arr[i] == arr[arr[i]-1]){
                    i++;
                }
            }
        }
    }
    
    public static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}