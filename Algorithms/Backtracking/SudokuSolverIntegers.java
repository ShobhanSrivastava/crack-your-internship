public class SudokuSolverIntegers {
    public static void main(String[] args) {
        int[][] board = {{5,3,0,0,7,0,0,0,0},
                        {6,0,0,1,9,5,0,0,0},
                        {0,9,8,0,0,0,0,6,0},
                        {8,0,0,0,6,0,0,0,3},
                        {4,0,0,8,0,3,0,0,1},
                        {7,0,0,0,2,0,0,0,6},
                        {0,6,0,0,0,0,2,8,0},
                        {0,0,0,4,1,9,0,0,5},
                        {0,0,0,0,8,0,0,7,9}};
        solve(board);
    }
    
    static void solve(int[][] board){
        int row = -1;
        int column = -1;
        
        for(int i=0 ; i<board.length ; i++){
            for(int j=0 ; j<board[0].length ; j++){
                if(board[i][j] == 0){
                    row = i;
                    column = j;
                    break;
                }
            }
        }
        
        if(row == -1 && column == -1){
            display(board);
            System.out.println();
            return;
        }
        
        for(int i=1 ; i<=9 ; i++){
            if(isSafe(board, row, column, i)){
                board[row][column] = i;
                solve(board);
                board[row][column] = 0;
            }
        }
    }
    
    static boolean isSafe(int[][] board, int row, int column, int number){
        for(int i=0 ; i<board[0].length ; i++){
            if(i != column && board[row][i]==number){
                return false;
            }
        }

        for(int i=0 ; i<board.length ; i++){
            if(i != row && board[i][column]==number){
                return false;
            }
        }

        int rowStart = getStart(row);
        int colStart = getStart(column);

        for(int i = rowStart ; i<=rowStart+2 ; i++){
            for(int j = colStart ; j<=colStart+2 ; j++){
                if(board[row][column] == number){
                    return false;
                }
            }
        }

        return true;
    }

    static int getStart(int position){
        if(position >= 0 && position <=2){
            return 0;
        }
        else if(position >= 3 && position <=5){
            return 3;
        }
        else if(position >= 6 && position <=8){
            return 6;
        }

        return -1;
    }

    static void display(int[][] board){
        for(int[] row : board){
            for(int block : row){
                System.out.print(block+" ");
            }
            System.out.println();
        }
    }
}
