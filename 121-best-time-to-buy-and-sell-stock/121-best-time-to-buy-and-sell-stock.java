class Solution {
    public int maxProfit(int[] prices) {
        int maxPro = 0;
        int currPro = 0;
        
        for(int i=1 ; i<prices.length ; i++){
            int diff = prices[i]-prices[i-1];
            
            currPro = Math.max(diff, currPro+diff);
            maxPro = Math.max(currPro, maxPro);
        }
        
        return maxPro;
    }
}