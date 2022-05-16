class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int sum = 0, rem = 0, count = 0;
        
        map.put(0,1);
        
        for(int i=0 ; i<nums.length ; i++){
            sum += nums[i];
            rem = sum%k;
            
            if(rem < 0){
                rem += k;
            }
            
            if(!map.containsKey(rem)){
                map.put(rem,1);
            }
            else{
                int freq = map.get(rem);
                count += freq;
                map.put(rem, freq+1);
            }
        }
        
        return count;
    }
}