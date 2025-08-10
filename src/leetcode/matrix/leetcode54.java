package leetcode.matrix;

import java.util.ArrayList;
import java.util.List;

public class leetcode54 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        leetcode54 lc = new leetcode54();
        System.out.println(lc.spiralOrder(matrix));
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (matrix == null || matrix.length == 0)
            return ans;

        int top = 0, left = 0,
                bottom = matrix.length - 1,
                right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // 按顺序执行 右 -> 下 -> 左 ->上
            for (int col = left; col <= right; col++) {
                ans.add(matrix[top][col]);
            }
            // 执行完右移操作
            top++;//上界下移
            //开始下移
            for (int row = top; row <= bottom; row++) {
                ans.add(matrix[row][right]);
            }
            //下移操作结束
            right--;//右边界左移
            // 先判断当前还能不能移动
            //开始左移
            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    ans.add(matrix[bottom][col]);
                }
            }

            // 左移结束
            bottom--;//下界收缩
            // 开始上移
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    ans.add(matrix[row][left]);
                }
            }
            //上移结束
            left++;
        }
        return ans;
    }
}
