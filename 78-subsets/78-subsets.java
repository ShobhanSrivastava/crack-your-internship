class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        
        subsetFind(nums, 0, list, result);
        
        return result;
    }
    
    public void subsetFind(int[] nums, int i, List<Integer> list, List<List<Integer>> result){
        if(i == nums.length){
            result.add(list);
            return;
        }
        
        List<Integer> dummy = new ArrayList<>(list);
        dummy.add(nums[i]);
        
        subsetFind(nums, i+1, new ArrayList<>(dummy), result);
        subsetFind(nums, i+1, new ArrayList<>(list), result);
    }
}