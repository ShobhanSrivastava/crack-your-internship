public class NKnights {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board = new boolean[n][n];
        System.out.println(nKnights(board, 0)); 
    }

    static int nKnights(boolean[][] board, int row){

        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;

        for(int i=0 ; i<board.length ; i++){
            if(isSafe(board, row, i)){
                board[row][i] = true;
                count += nKnights(board, row+1);
                board[row][i] = false;
            }
        }

        return count;
    }

    static boolean isSafe(boolean[][] board, int row, int col){
        if(col-2 >= 0 && row-1 >= 0){
            if(board[row-1][col-2]){
                return false;
            }
        }

        if(col-1 >= 0 && row-2 >= 0){
            if(board[row-2][col-1]){
                return false;
            }
        }

        if(col+1 <= board.length-1 && row-2 >= 0){
            if(board[row-2][col+1]){
                return false;
            }
        }

        if(col+2 <= board.length-1 && row-1 >= 0){
            if(board[row-1][col+2]){
                return false;
            }
        }

        return true;
    }

    static void display(boolean[][] board){
        for(boolean[] row : board){
            for(boolean element : row){
                if(element){
                    System.out.print("K ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
