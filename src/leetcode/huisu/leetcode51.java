package leetcode.huisu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode51 {
    public static void main(String[] args) {
        leetcode51 lc = new leetcode51();
        System.out.println(lc.solveNQueens(4));
    }
    public List<List<String>> solveNQueens(int n) {
        // 首先需要一个数组来记录答案
        List<List<String>> ans = new ArrayList<>();
        // 然后需要一个数组来表示棋盘
        char[][] borad = new char[n][n];
        // 初始化棋盘
        for(char[] row:borad){
            Arrays.fill(row, '.');
        }
        dfs(borad,0,ans);// 从第0行开始递归
        return ans;

    }
    public void dfs(char[][] board,int row,List<List<String>> ans){
        int n = board.length;
        // 当所有行都遍历完的时候 就说明完成了一个解
        if(row == n){
            List<String> solution = new ArrayList<>();
            for(char[] r: board){
                solution.add(new String(r)); // 将每一行转换为字符串
            }
            ans.add(solution); // 将当前解添加到答案中
            return;
        }
        // 尝试在遍历每一列，在每一列都放置皇后
        for(int col=0;col<board[0].length;col++){
            if(!isValid(board,row,col)) continue;;
            board[row][col] = 'Q'; // 放置皇后
            dfs(board, row + 1, ans); // 一行一列只能放一个，这行放完递归到下一行
            board[row][col] = '.'; // 回溯，移除皇后
        }
    }

    public boolean isValid(char[][] board,int row,int col){
        int n = board.length;
        // 检查该列是否有皇后
        for(int i=0;i<row;i++){
            if(board[i][col] == 'Q') return false;
        }
        // 检查左上对角线是否有皇后
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j] == 'Q') return false;
        }
        // 检查右上对角线是否有皇后
        for(int i=row-1,j=col+1;i>=0 && j<n;i--,j++){
            if(board[i][j] == 'Q') return false;
        }
        return true; // 如果没有冲突，返回true
    }
}
