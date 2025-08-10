package leetcode.matrix;

import java.util.HashMap;

public class leetcode36 {
    public static void main(String[] args) {
        char[][] board = {{'8', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
//        leetcode36 lc = new leetcode36();
//        System.out.println(lc.isValidSudoku(board));
    }
    public boolean isValidSudoku(char[][] board) {
        int l = board.length;
        for(int i =0;i<l;i++){
            HashMap<Character, Integer> map = new HashMap<>();
            for(int j =0;j<l;j++){
                if(map.containsKey(board[i][j])){
                    return false;
                }
            }
        }
        return true;
    }
}
