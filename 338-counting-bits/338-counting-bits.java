class Solution {
    public int[] countBits(int n) {
        int[] bits = new int[n+1];
        
        for(int i=0 ; i<=n ; i++){
            bits[i] = setBits(i);
        }
        
        return bits;
    }
    
    
    public int setBits(int num){
        int count = 0;
        while(num != 0){
            int rsbm = num & -num;
            count++;
            num -= rsbm;
        }
        
        return count;
    }
}