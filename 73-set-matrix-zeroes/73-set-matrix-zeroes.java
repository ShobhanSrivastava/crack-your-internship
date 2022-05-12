class Solution {
    public void setZeroes(int[][] matrix) {
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        
        int cell = 1;
        
        for(int i=0 ; i<rowLen ; i++){
            for(int j=0 ; j<colLen ; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    if(i != 0){
                        matrix[i][0] = 0;
                    }
                    else{
                        cell = 0;
                    }
                }
            }
        }
        
        for(int i=matrix.length-1 ; i>=0 ; i--){
            for(int j=matrix[0].length-1 ; j>=0 ; j--){
                if(i != 0){
                    if(matrix[0][j] == 0 || matrix[i][0] == 0){
                        matrix[i][j] = 0;
                    }
                }
                else{
                    if(matrix[0][j] == 0 || cell == 0){
                        matrix[i][j] = 0;
                    }
                }
            }
        }
    }
}