package leetcode.shuzu;

import java.util.Arrays;

public class leetcode122 {
//    private int[] prices;
//    private int[][] memo;

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        leetcode122 lc = new leetcode122();
        System.out.println(lc.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        //第二种解法
        int profit = 0;
        int length = prices.length;
        int[] nums = new int[length - 1];
        // 还是假设每天都卖出
        // 遍历数组计算每天与之前的差值 就可以得到 每天的收益
        for (int i = 1; i < length; i++) {
            nums[i - 1] = prices[i] - prices[i - 1];
        }
        // 遍历收益即可得到最多收益之和
        for (int i = 0; i < length - 1; i++) {
            if (nums[i] > 0) {
                profit += nums[i];
            }
        }
        return profit;
    }
}
//    public int maxProfit(int[] prices) {
        // 这题 与上一题有所不同
        // 可以考虑从状态转移
        // 从最后一天考虑 每天的收益都考虑卖出或不操作以及买入
        // 每天的收益都依赖于前n-1天的
        // 若不操作 dfs(i,1)=dfs(i-1,1)  dfs(i,0)=dfs(i-1,0) 第二个参数表示是否持有
        // 若卖出 则dfs(i,0)=dfs(i-1,1)+prices[i]
        // 若买入 则dfs(i,1)=dfs(i-1,0)-prices[i]
        //
//        this.prices = prices;
//        int n = prices.length;
//        memo = new int[n][2];
//        for (int[] row : memo) {
//            Arrays.fill(row, -1); // -1 表示还没有计算过
//        }
//        return dfs(n - 1, 0);
//    private int dfs(int i, int hold) {
//        // 因为i<0的话 表示第0天之前了 不可能持有股票 所以收益为0
//        if (i < 0) {
//            return hold == 1 ? Integer.MIN_VALUE : 0;
//        }
//        // 如果计算过这个收益值了 那就直接返回
//        if (memo[i][hold] != -1) {
//            return memo[i][hold]; // 之前计算过
//        }
//        //  如果持有 那么利润这样计算
//        //  可能是之前也持有 当前不进行任何操作
//        //  以及 之前未持有 当前买入
//        if (hold == 1) {
//            return memo[i][hold] = Math.max(dfs(i - 1, 1), dfs(i - 1, 0) - prices[i]);
//        }
//        // 如果当前未持有
//        // 利润由2部分构成
//        // 之前也未持有 不进行任何操作
//        // 以及 之前持有 现在卖出
//        return memo[i][hold] = Math.max(dfs(i - 1, 0), dfs(i - 1, 1) + prices[i]);
//    }

