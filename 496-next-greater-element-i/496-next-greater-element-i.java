class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0 ; i<nums2.length ; i++){
            map.put(nums2[i], i);
            
            if(stack.empty()){
                stack.push(i);
            }
            else{
                // if(nums2[i] > nums2[top]){
                while(!stack.empty() && nums2[i] > nums2[stack.peek()]){
                    nums2[stack.peek()] = nums2[i];
                    stack.pop();
                }
                
                stack.push(i);
                // }
                // else{
                //     stack.push(i);
                // }
            }
        }
        
        while(!stack.empty()){
            nums2[stack.peek()] = -1;
            stack.pop();
        }
        
        for(int i=0 ; i<nums1.length ; i++){
            int index = map.get(nums1[i]);
            nums1[i] = nums2[index];
        }
        
        return nums1;
    }
}