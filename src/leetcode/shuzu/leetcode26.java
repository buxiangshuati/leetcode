package leetcode.shuzu;

import java.util.Arrays;

public class leetcode26 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};
        leetcode26 lc = new leetcode26();
        int k = lc.removeDuplicates(nums);
        System.out.println(k);
        System.out.println(Arrays.toString(nums));
    }

    public int removeDuplicates(int[] nums) {
        int k = 1; // 用于表示nums数组的当前填充索引
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] != nums[i]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}
