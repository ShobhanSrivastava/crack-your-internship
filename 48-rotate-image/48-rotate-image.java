class Solution {
    public void rotate(int[][] matrix) {
        int rStart = 0, rEnd = matrix.length-1, cStart = 0, cEnd = matrix[0].length-1;
        
        int len = matrix.length;
        
        for(int i=0 ; i<len/2 ; i++){
            for(int j=cStart ; j<cEnd ; j++){
                int r=i, c=j;
                int val = matrix[i][j];
                
                //Swapping with RightIndex
                int temp = matrix[c][cEnd];
                matrix[c][cEnd] = val;
                val = temp;
                
                //Swapping with BottomIndex
                temp = matrix[rEnd][len-c-1];
                matrix[rEnd][len-c-1] = val;
                val = temp;
                
                //Swapping with LeftIndex
                temp = matrix[len-c-1][cStart];
                matrix[len-c-1][cStart] = val;
                val = temp;
                
                //Swapping with TopIndex
                matrix[r][c] = val;
            }
            
            rStart++;
            cStart++;
            rEnd--;
            cEnd--;
        }
    }
    
    // public void swap(int[][] matrix, int val, int nRow, int nCol){
    //     int temp = val;
    //     matrix[r][c] = matrix[nRow][nCol];
    //     matrix[nRow][nCol] = temp;
    // }
}