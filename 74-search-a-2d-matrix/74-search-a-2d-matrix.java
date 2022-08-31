class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        // if(matrix.length == 1){
        //     return binarySearch(matrix[0], target);
        // }
        
        for(int i=0 ; i<matrix.length ; i++){
            if(matrix[i][cols-1] >= target && matrix[i][0] <= target){                
                return binarySearch(matrix[i],target);
            }
        }
        
        return false;
    }
    
    public boolean binarySearch(int[] matrix, int target){
        int low = 0, high = matrix.length-1;
        
        while(low <= high){
            int mid = low + (high-low)/2;

            if(matrix[mid] == target){
                return true;
            }
            else if(matrix[mid] > target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        
        return false;
    }
}