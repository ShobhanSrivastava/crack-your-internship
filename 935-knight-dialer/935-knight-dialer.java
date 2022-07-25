class Solution {
    
    int[][] possibleMoves = {{4, 6}, {6, 8}, {7, 9}, {4, 8}, {0, 3, 9}, {}, {0, 1, 7}, {2, 6}, {1, 3}, {2, 4}};
    final static int modulo = 1000000007;
    
    public int knightDialer(int n) {
        long[][] distinct = new long[n+1][10];
        
        for(int i=0 ; i<10 ; i++){
            distinct[1][i] = 1;
        }
        
        for(int i=2 ; i<n+1 ; i++){
            for(int j=0 ; j<10 ; j++){
                
                long sum = 0;
                for(int k=0 ; k<possibleMoves[j].length ; k++){
                    int value = possibleMoves[j][k];
                    sum += distinct[i-1][value];
                    sum %= modulo;
                }
                
                distinct[i][j] = sum;
            }
        }
        
        long sum = 0;
        for(int i=0 ; i<10 ; i++){
            sum += distinct[n][i];
            sum %= modulo;
        }
        
        return (int)sum%modulo;
    }
}