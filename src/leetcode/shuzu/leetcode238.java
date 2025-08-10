package leetcode.shuzu;

import java.util.Arrays;

public class leetcode238 {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4};
        leetcode238 lc = new leetcode238();
        System.out.println(Arrays.toString(lc.productExceptSelf(nums)));
    }
    public int[] productExceptSelf(int[] nums) {
//        // 除自身外 其余数的乘积
//        // 那么对于nums[i]元素来说 这个乘积其实就是
//        // num[i] 之前元素的乘积 以及 之后元素的乘积
//        int n = nums.length;
//        int[] pre = new int[n]; // 储存当前元素左边的乘积
//        pre[0] =1;// 给定初始值为1
//        for(int i=1;i<n;i++){
//            pre[i] = pre[i-1] * nums[i-1];
//        }
//        int[] suf = new int[n];
//        suf[n-1] = 1;
//        for(int i=n-2;i>=0;i--){
//            suf[i] = suf[i+1] * nums[i+1];
//        }
//        int[] res = new int[n];
//        for(int i =0;i<n;i++){
//            res[i] = pre[i] *suf[i];
//        }
//        return res;
        return null;
    }
}
