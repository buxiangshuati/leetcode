package leetcode.shuzu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode56 {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        leetcode56 lc = new leetcode56();
        System.out.println(Arrays.toString(lc.merge(intervals)));

    }
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (p, q) -> p[0] - q[0]); // 将左端点按照从小到大的顺序排序
        ArrayList<int[]> ans = new ArrayList<>();
        for(int[] p:intervals){
            int m = ans.size();
            if(m>0 && p[0] <= ans.get(m-1)[1]){
                ans.get(m-1)[1] = Math.max(ans.get(m-1)[1],p[1]);
            }else {
                ans.add(p);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
