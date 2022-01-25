import java.util.ArrayList;

public class NQueens {
    public static void main(String[] args) {
        int a = 4;
        ArrayList<String> board = new ArrayList<>();
        for(int i=0 ; i<a ; i++){
            board.add("....");
        }

        System.out.println(putQueens(board, 0));
    }

    public static ArrayList<ArrayList<String>> putQueens(ArrayList<String> board, int row){
        if (row == board.size()){
            ArrayList<ArrayList<String>> result = new ArrayList<>();
            result.add(board);
            return result;
        }

        ArrayList<ArrayList<String>> result = new ArrayList<>();

        String rowBoard = board.get(row);
        for(int i=0 ; i<board.size() ; i++){
            if(isSafe(board, row, i)){
                String newStr = rowBoard.substring(0,i) + 'Q' + rowBoard.substring(i+1);
                board.set(row, newStr);
                result.addAll(putQueens(new ArrayList<>(board), row+1));
                board.set(row, rowBoard);
            }
        }

        return result;
    }

    public static boolean isSafe(ArrayList<String> board, int row, int col){
        for(int i=0 ; i<row ; i++){
            String rowBoard = board.get(i);
            if(rowBoard.charAt(col) == 'Q'){
                return false;
            }
        }

        int len = board.get(0).length();
        
        int colLeft = col - 1;
        int colRight = len - col;
        for(int i=0 ; i<row ; i++){
            String rowBoard = board.get(row-i-1);
            if(colLeft >= 0 && rowBoard.charAt(colLeft) == 'Q'){
                return false;
            }

            if(colRight < len-1 && rowBoard.charAt(colRight) == 'Q'){
                return false;
            }

            colLeft--;
            colRight--;
        }

        return true;
    }

}
