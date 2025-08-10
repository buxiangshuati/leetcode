package leetcode.dongtaiguihua;

public class leetcode102 {
    public static void main(String[] args) {
        leetcode102 lc = new leetcode102();
        System.out.println(lc.findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3));
    }
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0; // 计算总和
        for (int num : nums) {
            sum += num;
        }

        // 若不满足转化条件（总和过小或无法整除），返回 0
        if ((target + sum) % 2 != 0 || Math.abs(target) > sum) {
            return 0;
        }

        int subsetSum = (target + sum) / 2; // 转化后的子集目标和

        // dp[i] 表示和为 i 的方案数
        int[] dp = new int[subsetSum + 1];
        dp[0] = 1; // 和为0的方案数是1（什么都不选）

        // 遍历数组构建方案数
        for (int num : nums) {
            // 从大到小遍历，避免重复使用数字（0-1背包）
            for (int j = subsetSum; j >= num; j--) {
                dp[j] += dp[j - num]; // 当前和的方案数 = 不选 + 选 num 的方案数
                // 其实就是类似爬楼梯问题了 当我当前需要和为x的时候 距离我为x-num的位置 可以一步就完成 所以我当前的方案数 就是它的方案数
            }
        }
        return dp[subsetSum]; // 返回最终的方案数
    }
}
