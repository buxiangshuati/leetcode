package leetcode.erfen;

public class leetcode74 {
    public static void main(String[] args) {
        int[][] matrix = {{1},{3}};
        leetcode74 lc = new leetcode74();
        System.out.println(lc.searchMatrix(matrix,3));
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length-1;
        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == target){
                return true; // 如果找到目标值，返回 true
            } else if(matrix[row][col] > target){
                col--; // 如果当前值大于目标值，向左移动
            } else {
                row++; // 如果当前值小于目标值，向下移动
            }
        }
        return false; // 如果没有找到目标值，返回 false
    }
}
