package leetcode.huadongchuangkou;

public class leetcode209 {
    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2,3,1,2,4,3};
        leetcode209 lc = new leetcode209();
        System.out.println(lc.minSubArrayLen(target,nums));
    }
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int ans = n+1;// 记录返回的数组长度
        int sum = 0; // 记录数组的和
        int left = 0; // 记录左端点
        for(int right=0; right<n;right++){
            sum+=nums[right]; // 不断更新总和
            while(sum >= target){
                // 当满足要求时
                ans = Math.min(ans,right-left+1); // 更新数组长度 是否有变短
                sum -= nums[left];// 更新数组 搜索下一个满足的子数组
                left++; // 左端点右移 寻找下一个答案
            }
        }
        return ans<= n ? ans :0; // 因为我们初始化ans =n+1
                                // 所以要是循环结束 没有满足要求的话 就会返回n+1 因此要重置为0
    }
}
