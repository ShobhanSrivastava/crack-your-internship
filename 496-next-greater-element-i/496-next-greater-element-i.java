class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        // HasmMap<Integer, Integer> greaterMap = new HashMap<>();
        
        int greater = nums2[nums2.length-1];
        for(int i=nums2.length-1 ; i>=0 ; i--){
            indexMap.put(nums2[i], i);
        }
        
        for(int j=0 ; j<nums1.length ; j++){
            int index = indexMap.get(nums1[j]);
            boolean found = false;
            for(int k=index+1 ; k<nums2.length ; k++){
                if(nums2[k] > nums1[j]){
                    found = true;
                    nums1[j] = nums2[k];
                    break;
                }
            }
            
            if(!found){
                nums1[j] = -1;
            }
        }
        
        return nums1;
    }
}