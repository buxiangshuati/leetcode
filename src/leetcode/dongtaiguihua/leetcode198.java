package leetcode.dongtaiguihua;

public class leetcode198 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        leetcode198 lc = new leetcode198();
        System.out.println(lc.rob(nums));
    }

    public int rob(int[] nums) {
        if (nums.length <= 1) {
            return nums[0];
        }
        int[] dp = new int[nums.length]; // 储存偷每间房子的最大收益
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]); // 每间房子i的最大收益与自己的价值以及i-2间房子有关
        }
        return dp[nums.length - 1];
    }
}
