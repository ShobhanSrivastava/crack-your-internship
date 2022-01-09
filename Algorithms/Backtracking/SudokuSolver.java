public class SudokuSolver {
    public static void main(String[] args) {
        String[][] board = {{"5","3",".",".","7",".",".",".","."},
                            {"6",".",".","1","9","5",".",".","."},
                            {".","9","8",".",".",".",".","6","."},
                            {"8",".",".",".","6",".",".",".","3"},
                            {"4",".",".","8",".","3",".",".","1"},
                            {"7",".",".",".","2",".",".",".","6"},
                            {".","6",".",".",".",".","2","8","."},
                            {".",".",".","4","1","9",".",".","5"},
                            {".",".",".",".","8",".",".","7","9"}};

        sudokuSolver(board, 0, 1);
    }

    static void sudokuSolver(String[][] board, int row, int column, int number){
        if(row == board.length){
            display(board);
            return;
        }

        if(isSafe(board, row, column, number)){
            board[row][column] = Integer.toString(number);
            if(column < board.length-1){
                for(int i=1 ; i<=9 ; i++){
                    sudokuSolver(board, row+1, 0, i);
                }
            }
            else{
                for(int i=1 ; i<=9 ; i++){
                    sudokuSolver(board, row, column+1, i);
                }
            }

            board[row][i] = ".";
        }
    }

    static boolean isSafe(String[][] board, int row, int column, int number){
        for(int i=0 ; i<board[0].length ; i++){
            if(i != column && !board[row][i].equals(".") && board[row][i].charAt(0)-49 == number){
                return false;
            }
        }

        for(int i=0 ; i<board.length ; i++){
            if(i != row && !board[i][column].equals(".") && board[i][column].charAt(0)-49 == number){
                return false;
            }
        }

        int rowStart = getStart(row);
        int colStart = getStart(column);

        for(int i = rowStart ; i<=rowStart+2 ; i++){
            for(int j = colStart ; j<=colStart+2 ; j++){
                if(board[row][column].charAt(0)-49 == number){
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

    static void display(String[][] board){
        for(String[] row : board){
            for(String block : row){
                System.out.print(block+" ");
            }
            System.out.println();
        }
    }
}
