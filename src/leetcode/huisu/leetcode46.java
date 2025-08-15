package leetcode.huisu;

import java.util.ArrayList;
import java.util.List;

public class leetcode46 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        leetcode46 lc = new leetcode46();
        System.out.println(lc.permute(nums));
    }
    public List<List<Integer>> permute(int[] nums) {
        // 首先需要一个数组来记录使用过的数字
        boolean[] used = new boolean[nums.length];
        // 存储最终结果
        List<List<Integer>> ans = new ArrayList<>();
        dfs(nums, ans, new ArrayList<>(), used);
        return ans;
    }
    public void dfs(int[] nums, List<List<Integer>> ans,
                    List<Integer> path, boolean[] used) {
        // 递归终止条件
        if(path.size() == nums.length) {
            // 如果路径长度等于数组长度，说明已经找到一个排列
            ans.add(new ArrayList<>(path));
            return;
        }
        // 遍历数组中的每个数字
        for(int i=0;i<nums.length;i++){
            // 如果当前数字已经被用过了
            if(used[i]) continue;
            path.add(nums[i]); // 将当前数字添加到路径中
            used[i] = true; // 标记当前数字为已使用
            dfs(nums, ans, path, used); // 递归调用
            path.remove(path.size() - 1); // 回溯，移除最后一个数字
            used[i] = false; // 恢复标记，表示当前数字可以再次使用
        }
    }
}
