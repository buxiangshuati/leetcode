package leetcode.shuzu;

import java.util.Arrays;

public class leetcode80 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,2,2,3,4};
        leetcode80 lc = new leetcode80();
        int i = lc.removeDuplicates(nums);
        System.out.println(i);
        System.out.println(Arrays.toString(nums));
    }

    public int removeDuplicates(int[] nums) {
        int k = 2; // 记录nums当前修改的索引位置
        for(int i =2 ; i<nums.length; i++){
            if(nums[k-2] != nums[i]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
