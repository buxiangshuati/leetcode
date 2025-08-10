package leetcode.zhizhen;

public class leetcode42 {
    public static void main(String[] args) {
        int[] height ={0,1,0,2,1,0,1,3,2,1,2,1};
        leetcode42 lc = new leetcode42();
        System.out.println(lc.trap(height));
    }
//    public int trap(int[] height) {
//        // 首先我们使用一种前后缀思想来解决
//        // 先遍历分别获取 前缀 与 后缀
//        // 分别表示 当前位置之前和之后的最长高度
//        int n = height.length;
//        int[] pre = new int[n];
//        pre[0] = height[0];
//        int[] suf = new int[n];
//        suf[n-1] = height[n-1];
//        for(int i =1;i<n;i++){
//            pre[i] = Math.max(pre[i-1],height[i]);
//            suf[n-1-i] = Math.max(suf[n-i], height[n-1-i]);
//        }
//        int[] list = new int[n];
//        int ans =0;
//        for(int i =0;i<n;i++){
//             list[i] = Math.min(suf[i],pre[i]);
//             ans += list[i] - height[i];
//        }
//        return ans;
//    }
    public int trap(int[] height) {
        int n = height.length;
        int ans =0;
        int left=0,right =n-1; // 定义左右指针
        int pre_max = 0 ,suf_max =0;
        while(left <= right){
            pre_max = Math.max(pre_max,height[left]);
            suf_max = Math.max(suf_max,height[right]);
            if(pre_max < suf_max){
                ans += pre_max-height[left];
                left ++;
            }else{
                ans += suf_max-height[right];
                right --;
            }
        }
        return ans;
    }
}
