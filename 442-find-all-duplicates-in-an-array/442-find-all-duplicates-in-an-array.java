class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        
        cycleSort(nums);
        
        for(int i=0 ; i<nums.length ; i++){
            if(i != nums[i]-1){
                result.add(nums[i]);
            }
        }
        
        return result;
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