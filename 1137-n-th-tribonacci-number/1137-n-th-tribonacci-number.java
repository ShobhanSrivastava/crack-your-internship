class Solution {
    public int tribonacci(int n) {
        Integer[] qb = new Integer[n+1];
        
        return tribo(n, qb);
    }
    
    public int tribo(int n, Integer[] qb){
        if(n == 0 || n == 1){
            return n;
        }
        else if(n == 2){
            return 1;
        }
        else{
            if(qb[n] != null){
                return qb[n];
            }
            
            qb[n] = tribo(n-1, qb) + tribo(n-2, qb) + tribo(n-3, qb);
            
            return qb[n];
        }
    }
}