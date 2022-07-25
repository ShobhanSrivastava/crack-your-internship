class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sumLeft = 0; //Track of sum of elements on left
        for(int i=0 ; i<k ; i++){
            sumLeft += cardPoints[i];
        }
        
        int sumRight = 0; //Track of sum of elements on right
        
        int maxSum = sumLeft;
        
        int leftEnd = k-1;
        int rightStart = cardPoints.length - 1;
        
        for(int i=1 ; i<=k ; i++){
            sumLeft -= cardPoints[leftEnd--];
            sumRight += cardPoints[rightStart--];
            maxSum = Math.max(maxSum, sumLeft+sumRight);
        }
        
        return maxSum;
    }
}