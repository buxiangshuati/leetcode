package leetcode.shuzu;

public class leetcode121 {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        leetcode121 lc = new leetcode121();
        System.out.println(lc.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        // 这题的思路 可以两个for循环暴力破解 但是肯定超时

        // 那么考虑这样一种 一次遍历的方法
        // 假设每天都考虑卖出 然后与记录的最小值进行相减 并且与记录的最大利润比较
        // 在一次遍历中 即可实时更新
        int min_price = prices[0];
        int profit = 0;
        for(int y : prices){
            profit = Math.max(profit,y-min_price);
            min_price = Math.min(min_price,y);
        }
        return profit;
    }
}
