package leetcode.zhan;

import java.util.ArrayDeque;
import java.util.Arrays;

public class leetcode739 {
    public static void main(String[] args) {
        leetcode739 lc = new leetcode739();
        System.out.println(Arrays.toString(lc.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
    }

    public int[] dailyTemperatures(int[] temperatures) {
        // 思路就是 利用栈来储存元素 当遇到比栈顶元素大的时候 取出并计算差值
        // 碰到小的 就继续进栈
        int n = temperatures.length;
        int[] res = new int[n];

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            // 获取当前温度
            int cur = temperatures[i];
            // 只有当栈不为空 并且当前温度大于栈顶温度时 才进行出栈操作
            while (!deque.isEmpty() && cur > temperatures[deque.peek()]) {
                int top = deque.pop(); // 获取栈顶元素(之前的日期)
                res[top] = i - top;//计算与当前日期的天数差距即可
            }
            // 当前温度低 继续入栈即可
            deque.push(i);
        }
        return res;
    }
}
