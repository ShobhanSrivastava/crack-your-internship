import javax.swing.border.Border;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(nQueens(board, 0));
    }

    static int nQueens(boolean[][] board, int row){
        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;
        for(int i=0 ; i<board[0].length ; i++){
            if(isSafe(board, row, i)){
                board[row][i] = true;
                count += nQueens(board, row+1);
                board[row][i] = false;
            }
        }
        return count;
    }

    static boolean isSafe(boolean[][] board, int row, int col){
        for(int i=0 ; i<board.length ; i++){
            if(board[i][col]){
                return false;
            }
        }

        int maxLeft = Math.min(row, col);
        for(int i=1 ; i<=maxLeft ; i++){
            if(board[row-i][col-i]){
                return false;
            }
        }

        int maxRight = Math.min(row, board[0].length-1-col);
        for(int i=1 ; i<=maxRight ; i++){
            if(board[row-i][col+i]){
                return false;
            }
        }

        return true;
    }

    static void display(boolean[][] board){
        for(boolean[] row : board){
            for(boolean element : row){
                if(element){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
