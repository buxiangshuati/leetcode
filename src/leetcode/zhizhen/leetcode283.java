package leetcode.zhizhen;

import java.util.Arrays;

public class leetcode283 {
    // 移动0 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
    //请注意 ，必须在不复制数组的情况下原地对数组进行操作。
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        leetcode283 lc = new leetcode283();
        lc.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
    public void moveZeroes(int[] nums) {
        // 假设输入为 0,1,0,3,12
        int left=0; // 定义左右指针  左指针用于按序放入非零元素  右指针用于探测新元素是否为零
        for(int right =0;right<nums.length;right++){
            if(nums[right] != 0){ // 当右指针碰到一个非零元素的时候
                nums[left] = nums[right];//就把这个元素放到当前左指针的位置 进行排序
                left++; // 左指针移动一位 准备存放下一个元素
            }
        }
        // 如果所有元素都探测完了，结束了，说明全部的非零元素已经探测完毕，那么就把后面全部填充为0覆盖即可
        for(int right =left;right<nums.length;right++){
            nums[right] = 0;
        }
    }
}
