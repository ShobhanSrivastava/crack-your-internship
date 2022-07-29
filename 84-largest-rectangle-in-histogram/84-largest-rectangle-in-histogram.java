class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        
        int len = heights.length;
        int[] leftSmaller = new int[len];
        
        for(int i=0 ; i<len ; i++){
            int element = heights[i];
            
            if(st.empty() || element >= heights[st.peek()]){
                st.push(i);
            }
            else{
                while(!st.empty() && element < heights[st.peek()]){
                    leftSmaller[st.peek()] = i;
                    st.pop();
                }
                
                st.push(i);
            }
        }
        
        while(!st.empty()){
            leftSmaller[st.peek()] = len;
            st.pop();
        }
        
        System.out.println(Arrays.toString(leftSmaller));
        
        int[] rightSmaller = new int[len];
        
        for(int i=len-1 ; i>=0 ; i--){
            int element = heights[i];
            
            if(st.empty() || element >= heights[st.peek()]){
                st.push(i);
            }
            else{
                while(!st.empty() && element < heights[st.peek()]){
                    rightSmaller[st.peek()] = i;
                    st.pop();
                }
                
                st.push(i);
            }
        }
        
        while(!st.empty()){
            rightSmaller[st.peek()] = -1;
            st.pop();
        }
        
        System.out.println(Arrays.toString(rightSmaller));
        
        int max = 0;
        for(int i=0 ; i<len ; i++){
            int area = heights[i] * (leftSmaller[i] - rightSmaller[i] - 1);
            max = Math.max(max, area);
        }
        
        return max;
    }
}