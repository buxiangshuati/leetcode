package leetcode.huadongchuangkou;

import java.util.HashMap;
import java.util.Map;

public class leetcode560 {
    public static void main(String[] args) {
        int[] nums = {-1,1,-1,1,0};
        int k = 0;
        leetcode560 lc = new leetcode560();
        System.out.println(lc.subarraySum(nums, k));
    }

    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>(); // 创建一个hashmap 存放
        int sum = 0, count = 0; // 计算前缀和以及符合条件的数组的次数
        map.put(0, 1); // 0 单独算
        for (int i : nums) {
            sum += i; // 计算前缀和
            if (map.containsKey(sum - k)) { // 如果当前数组和与k的差值存在 就说明存在一个子数组满足要求
                count += map.get(sum - k); // 计数+1
            }
            if (map.containsKey(sum)) { // 如果当前sum出现过
                map.put(sum, map.get(sum) + 1); // 那么继续+1  这里是为了防止0的出现
            } else {
                map.put(sum, 1); // 第一次的话 还是设置为1
            }
        }
        return count;
    }
}
