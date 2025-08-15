package leetcode.zhizhen;

import java.util.Arrays;

public class leetcode283 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        leetcode283 lc = new leetcode283();
        lc.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
    public void moveZeroes(int[] nums) {
        int left = 0;
        for(int right =0;right<nums.length;right++){
            if(nums[right] != 0){
                nums[left] = nums[right];
                left++;
            }
        }
        for(int right=left;right<nums.length;right++){
            nums[right] = 0;
        }
    }
}
