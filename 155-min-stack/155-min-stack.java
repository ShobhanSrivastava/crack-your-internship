class MinStack {

    Stack<Integer> s, min;
    public MinStack() {
        s = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int val) {        
        if(s.size() == 0){
            s.push(val);
            min.push(val);
            return;
        }
        
        s.push(val);
        
        if(val < min.peek()){
            min.push(val);
        }
        else{
            min.push(min.peek());
        }
    }
    
    public void pop() {
        min.pop();
        s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */