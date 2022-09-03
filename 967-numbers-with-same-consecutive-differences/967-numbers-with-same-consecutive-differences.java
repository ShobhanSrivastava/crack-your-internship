class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i=1 ; i<=9 ; i++){
            if(i-k >= 0 || i+k <= 9){
                result.add(i);
            }
        }
        n--;
        
        while(n-- > 0){
            result = findResult(result, k);
        }
        
        //Convert ArrayList to int[]
        
        int[] arr = new int[result.size()];
        
        for(int i=0 ; i<result.size() ; i++){
            arr[i] = result.get(i);
        }
        
        return arr;
    }
    
    public ArrayList<Integer> findResult(ArrayList<Integer> result, int k){
        ArrayList<Integer> newResult = new ArrayList<>();
        for(int i=0 ; i<result.size() ; i++){
            int num = result.get(i);
            
            int dig = num%10;
            
            if(dig-k >= 0 && k!=0){
                newResult.add(num*10 + (dig-k));
            }
            
            if(dig+k <= 9){
                newResult.add(num*10 + (dig+k));
            }
        }
        
        return newResult;
    }
}