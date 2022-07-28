class Solution {
    
    public List<String> generateParenthesis(int n) {
        List<String> list = generate(n, n, "");
        
        return list;
    }
    
    public List<String> generate(int open, int close, String result){
        List<String> res = new ArrayList<>();
        
        if(open == 0 && close == 0){
            res.add(result);
            
            return res;
        }
        
        if(open == 0){
            for(int i=1 ; i<=close ; i++){
                result = result + ')';
            }
            
            res.add(result);
            
            return res;
        }
        
        if(open == close){
            res.addAll(generate(open-1, close, result+'('));
            
            return res;
        }
        
        res.addAll(generate(open-1, close, result+'('));
        res.addAll(generate(open, close-1, result+')'));
        
        return res;
    }
    
}