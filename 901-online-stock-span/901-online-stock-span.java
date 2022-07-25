class StockSpanner {
    Stack<int[]> st;
        
    public StockSpanner() {        
        st = new Stack<>();
    }
    
    public int next(int price) {
        if(st.empty() || st.peek()[0] > price){
            int[] pair = {price, 1};
            st.push(pair);
            
            return 1;
        }
        else{
            int days = 0;
            while(!st.empty() && st.peek()[0] <= price){
                days += st.peek()[1];
                st.pop();
            }
            
            int[] pair = {price, days+1};
            st.push(pair);
            
            return st.peek()[1];
        }
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */