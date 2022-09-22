class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        int subsetCount = 1 << n;
        
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0 ; i<subsetCount ; i++){
            int num = i;
            List<Integer> subset = new ArrayList<>();
            int count = 0;
            while(num != 0){
                if((num&1) == 1){
                    subset.add(nums[count]);
                }
                count++;
                num = num >> 1;
            }
            
            result.add(subset);
        }
        
        return result;
    }
}