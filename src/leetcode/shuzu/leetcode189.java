package leetcode.shuzu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class leetcode189 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int k = 7;
        leetcode189 lc = new leetcode189();
        lc.rotate(nums,k);
        System.out.println(Arrays.toString(nums));
    }

    public void rotate(int[] nums, int k) {

        /**
         * 使用额外的数组解决
         */
//        int[] newList = new int[nums.length];
//        for(int i=0;i< nums.length;i++){
//            newList[((i+k) % nums.length)] = nums[i];
//        }
//        for(int i=0;i< nums.length;i++){
//            nums[i] = newList[i];
//        }
//        nums = newList;

        // 把数组向右移动 k 个单位  即数组末尾的k个元素会被移到数组头部
        // 比如[1,2,3,4,5] 向右移动2个单位 那么就会变成 [4,5,1,2,3]
        // 可以看到此时 4，5移到了最前面 那么我们这样来思考
        // 先把数组反转 [5,4,3,2,1]
        // 然后 把前k个元素在再反转 后n-k个元素也再反转 即可
        reverse(nums,0,nums.length-1);
        reverse(nums,0,(k-1)%nums.length);
        reverse(nums,k%nums.length,nums.length-1);

    }
    public void reverse(int[] nums,int i ,int j){
        while (i<j){
            // 对数组指定索引范围内的子数组 进行反转
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
