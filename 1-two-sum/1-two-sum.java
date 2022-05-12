class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int[] ans = new int[2];
        
        for(int i=0 ; i<nums.length ; i++){
            if(map.containsKey(nums[i])){
                ArrayList<Integer> list = map.get(nums[i]);
                list.add(i);
                map.put(nums[i], list);
            }
            else{
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(nums[i], list);
            }
        }
        
        for(int i=0 ; i<nums.length ; i++){
            int val = nums[i];
            int comp = target-val;
            
            if(map.containsKey(comp)){
                if(val == comp){
                    if(map.get(val).size() > 1){
                        ans[0] = map.get(val).get(0);
                        ans[1] = map.get(val).get(1);
                    }
                }
                else{
                    ans[0] = i;
                    ans[1] = map.get(comp).get(0);
                }
            }
        }
        
        return ans;
    }
}