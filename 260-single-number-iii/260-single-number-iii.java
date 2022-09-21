class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int num : nums){
            xor ^= num;
        }
        
        int mask = xor & -xor;
        
        int xor0 = 0, xor1 = 0;
        
        for(int num : nums){
            if((num & mask) == 0){
                xor0 ^= num;
            }
            else{
                xor1 ^= num;
            }
        }
        
        return new int[]{xor0, xor1};
    }
}