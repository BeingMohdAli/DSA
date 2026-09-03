package Recursion;

public class LC79 {
    static void main() {
        char[][] c= {
                {'A','B','C','D'},
                {'S','F','C','S'},
                {'A','D','E','E'}

        };

        boolean abcced = wordSearch(c, "ABCCED");
        System.out.println(abcced);

    }

    public static boolean wordSearch(char[][] board, String word){

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(dfs(i , j , board ,  word , 0)){
                    return true;
                }
                }
            }
        return false;
        }

        private static boolean dfs(int row, int col, char[][] board, String word, int index) {
        if(index == word.length()){
            return true;
        }

        if(row<0||col<0||row== board.length||col==board[0].length){
            return false;
        }

    if(board[row][col]!=word.charAt(index)){
            return false;
        }

    char temp= board[row][col];
    board[row][col] = '#';

            boolean ans = dfs(row + 1, col, board, word, index + 1) || dfs(row - 1, col, board, word, index + 1) || dfs(row, col + 1, board, word, index + 1) || dfs(row, col - 1, board, word, index + 1);

            board[row][col] = temp ;
        return ans;
        }


}
