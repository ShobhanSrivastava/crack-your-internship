class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int sum = findSum(n);
        
        while(true){
            if(sum == 1){
                return true;
            }
            
            else{
                sum = findSum(sum);
                
                if(map.get(sum) != null){
                    return false;
                }
                else{
                    map.put(sum,1);
                }
            }
        }   
    }
    
    public int findSum(int n){
        int sum = 0;
        
        while(n != 0){
            int rem = n%10;
            sum += rem*rem;
            n = n/10;
        }
        
        return sum;
    }
}