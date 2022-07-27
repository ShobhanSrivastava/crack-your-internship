class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<int[]> st = new Stack<>();
        
        for(int i=0 ; i<temp.length ; i++){
            while(!st.empty() && st.peek()[0]<temp[i]){
                int index = st.peek()[1];
                temp[index] = i-index;
                st.pop();
            }
            
            st.push(new int[]{temp[i], i});
        }
        
        while(!st.empty()){
            int index = st.peek()[1];
            temp[index] = 0;
            st.pop();
        }
        
        return temp;
    }
}