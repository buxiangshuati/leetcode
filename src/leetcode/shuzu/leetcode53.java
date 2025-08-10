package leetcode.shuzu;

public class leetcode53 {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        leetcode53 lc = new leetcode53();
        System.out.println(lc.maxSubArray(nums));
    }
    public int maxSubArray(int[] nums) {
        int res = 0;
        int cmax = Integer.MIN_VALUE;
        int cmin = 0;
        for(int i : nums){
            res += i;
            cmax = Math.max(cmax,res-cmin);
            cmin = Math.min(cmin,res);
        }
        return cmax;
    }
}
