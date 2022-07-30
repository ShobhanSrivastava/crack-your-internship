class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();
        
        for(int i=0 ; i<tokens.length ; i++){
            String str = tokens[i];
            
            if(isNumber(str.charAt(str.length()-1))){
                st.push(str);
            }
            else{
                int op2 = Integer.parseInt(st.pop());
                int op1 = Integer.parseInt(st.pop());
                
                int result = solve(str.charAt(0), op1, op2);
                
                st.push(Integer.toString(result));
            }
        }
        
        return Integer.parseInt(st.peek());
    }
    
    public int solve(char ch, int op1, int op2){
        if(ch == '+'){
            return op1+op2;
        }
        else if(ch == '-'){
            return op1-op2;
        }
        else if(ch == '*'){
            return op1*op2;
        }
        else{
            return op1/op2;
        }
        
    }
    
    public boolean isNumber(char ch){
        if(Character.isDigit(ch)){
            return true;
        }
        
        return false;
    }
}