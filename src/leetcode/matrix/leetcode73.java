package leetcode.matrix;

import java.util.ArrayList;
import java.util.Arrays;

public class leetcode73 {
    public static void main(String[] args) {
        leetcode73 lc = new leetcode73();
        int[][] matrix = {{ 0, 1, 2, 0 },
                            { 3, 4, 5, 2 },
                            { 1, 3, 1, 5}};
        lc.setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> xlist = new ArrayList<>();
        ArrayList<Integer> ylist = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    xlist.add(i);
                    ylist.add(j);
                }
            }
        }
        for(int i:xlist){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=0;
            }
        }
        for(int j:ylist){
            for(int i=0;i<matrix.length;i++){
                matrix[i][j]=0;
            }
        }
    }

}
