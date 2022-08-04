class Solution {
    public int tribonacci(int n) {
        int[] qb = new int[n+1];
        
        return tribo(n, qb);
    }
    
    public int tribo(int n, int[] qb){
        if(n == 0 || n == 1){
            return n;
        }
        
        if(n == 2){
            return 1;
        }
        
        if(qb[n] != 0){
            return qb[n];
        }
        
        qb[n] = tribo(n-1, qb) + tribo(n-2, qb) + tribo(n-3, qb);
        
        return qb[n];
    }
}