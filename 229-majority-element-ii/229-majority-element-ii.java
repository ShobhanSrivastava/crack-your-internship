class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        //Populating the hashmap with the frequencies of each element
        for(int i=0 ; i<nums.length ; i++){
            if(map.containsKey(nums[i])){
                int count = map.get(nums[i]);
                map.put(nums[i], count+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        
        List<Integer> list = new ArrayList<>();
        for(int key : map.keySet()){
            if(map.get(key) > nums.length/3){
                list.add(key);
            }
        }
        
        return list;
    }
}