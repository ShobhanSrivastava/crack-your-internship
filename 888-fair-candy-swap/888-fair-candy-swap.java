class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceSum = 0, bobSum = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int alice : aliceSizes){
            aliceSum += alice;
            
            if(map.containsKey(alice)){
                int count = map.get(alice);
                map.put(alice, count+1);
            }
            else{
                map.put(alice, 1);
            }
        }
        
        for(int bob : bobSizes){
            bobSum += bob;
        }
        
        int target = (aliceSum + bobSum)/2;
        
        for(int bob : bobSizes){
            int reqAlice = target-bobSum+bob;
            if(map.containsKey(reqAlice)){
                return new int[]{reqAlice, bob};
            }
        }
        
        return new int[]{0,0};
    }
}