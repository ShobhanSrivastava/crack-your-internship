class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        
        int minRow = 0;
        int minCol = 0;
        
        int maxRow = matrix.length-1;
        int maxCol = matrix[0].length-1;
        
        int count = (maxRow+1) * (maxCol+1);
        
        while(count > 0){
            for(int i=minCol ; i<=maxCol && count>0 ; i++){
                result.add(matrix[minRow][i]);
                count--;
            }
            
            minRow++;
            
            for(int i=minRow ; i<=maxRow && count>0 ; i++){
                result.add(matrix[i][maxCol]);
                count--;
            }
            
            maxCol--;
            
            for(int i=maxCol ; i>=minCol && count>0 ; i--){
                result.add(matrix[maxRow][i]);
                count--;
            }
            
            maxRow--;
            
            for(int i=maxRow ; i>=minRow && count>0 ; i--){
                result.add(matrix[i][minCol]);
                count--;
            }
            
            minCol++;
        }
        
        return result;
    }
}