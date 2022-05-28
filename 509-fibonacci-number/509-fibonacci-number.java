class Solution {
    public int fib(int n) {
        if(n == 0 || n == 1){
            return n;
        }
        
        Integer[] qb = new Integer[n+1];
        qb[0] = 0;
        qb[1] = 1;
        
        return fibo(n, qb);
    }
    
    public int fibo(int n ,Integer[] qb){
        if(qb[n] != null){
            return qb[n];
        }
        
        qb[n] = fibo(n-1, qb) + fibo(n-2, qb);
        
        return qb[n];
    }
}