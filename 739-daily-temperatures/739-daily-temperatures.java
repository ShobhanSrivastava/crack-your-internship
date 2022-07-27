// class Solution {
//     public int[] dailyTemperatures(int[] temperatures) {
//         Stack<Integer> stack = new Stack<>();
//         int[] result = new int[temperatures.length];
//         for(int i = 0; i < temperatures.length; i++) {
//             while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
//                 int popped = stack.pop();
//                 result[popped] = i-popped;
//             }
//             stack.push(i);
//         }
//         return result;
//     }
// }

class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<int[]> st = new Stack<>();
        
        for(int i=0 ; i<temp.length ; i++){
            if(st.empty()){
                st.push(newArr(temp[i], i));
            }
            else{
                if(st.peek()[0] > temp[i]){
                    st.push(newArr(temp[i], i));
                }
                else{
                    int popCount = 0;
                    while(!st.empty() && st.peek()[0] < temp[i]){
                        int[] data = st.peek();
                        temp[data[1]] = i-data[1];
                        st.pop();
                    }
                    
                    st.push(newArr(temp[i], i));
                }
            }
        }
        
        while(!st.empty()){
            int[] data = st.peek();
            temp[data[1]] = 0;
            st.pop();
        }
        
        return temp;
    }
    
    public int[] newArr(int temp, int index){
        return new int[]{temp, index};
    }
}