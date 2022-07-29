class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        int[] nextGreater = new int[len];
        
        Stack<Integer> st = new Stack<>();
        
        for(int i=0 ; i<len ; i++){
            int num = nums[i];
            if(st.empty() || num<=nums[st.peek()]){
                st.push(i);
            }
            else{
                while(!st.empty() && num>nums[st.peek()]){
                    nextGreater[st.peek()] = i;
                    st.pop();
                }
                
                st.push(i);
            }
        }
        
        while(!st.empty()){
            nextGreater[st.peek()] = len;
            st.pop();
        }
        
        int[] result = new int[len-k+1];
        
        for(int i=0 ; i<len-k+1 ; i++){
            int next = i;
            while(true){
                if(nextGreater[next] > i+k-1){
                    result[i] = nums[next];
                    break;
                }
                
                next = nextGreater[next];
            }
        }
        
        return result;
    }
}