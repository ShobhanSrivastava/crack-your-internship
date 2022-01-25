import java.util.*;
public class Try {
    public static void main(String[] args) {
        solveNQueens(4);
    }

    public static void solveNQueens(int n){
        List<String> board = new ArrayList<>();

        String row = "";
        for(int i=0 ; i<n ; i++){
            row += '.';
        }

        for(int i=0 ; i<n ; i++){
            board.add(row);
        }

        System.out.println(nQueens(n, 0, board)); 
    }

    public static int nQueens(int n, int row, List<String> board){
        if(row == n){
            System.out.println(board);
            return 1;
        }

        int count = 0;

        String r = board.get(row);
        for(int i=0 ; i<r.length() ; i++){
            if(isSafe(board, row, i)){
                String newRow = r.substring(0,i)+"Q"+r.substring(i+1);
                board.set(row, newRow);
                count += nQueens(n, row+1, new ArrayList<>(board));
                board.set(row, r);
            }
        }
        
        return count;
    }

    public static boolean isSafe(List<String> board, int row, int col){
        int left = 1, right=1;
        for(int i=row-1 ; i>=0 ; i--){
            String r = board.get(i);
            if(r.charAt(col) == 'Q'){
                return false;
            }

            if(col-left >= 0 && r.charAt(col-left) == 'Q'){
                return false;
            }

            if(col+right < r.length() && r.charAt(col+right) == 'Q'){
                return false;
            }

            left++;
            right++;
        }

        return true;
    }
}
