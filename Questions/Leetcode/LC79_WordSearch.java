public class LC79_WordSearch {
    public static void main(String[] args) {
        
    }

    public static boolean search(char[][] board, int row, String word, String exists){
        if(row == board.length){
            return false;
        }

        for(int i=0 ; i<board[0].length ; i++){
            if(word.startsWith(exists+board[row][i])){
                exists += board[row][i];
                board[row][i] = '0';
                return search(board, row, word, exists);
            }
        }
    }
}
