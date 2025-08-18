package leetcode.erfen;

import java.util.Arrays;

public class leetcode34 {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        leetcode34 lc = new leetcode34();
        System.out.println(Arrays.toString(lc.searchRange(nums, target)));
    }

    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                // 当找到那个目标值的时候 就向两边进行扩张寻找
                int start = mid;
                int end = mid;

                // 当左右边界不越界 并且符合条件时 就进行扩张
                while(start > 0 && nums[start -1] == target){
                    start--;
                }
                while(end < nums.length && nums[end + 1] == target){
                    end--;
                }
                return new int[]{start, end};
            }
        }
        return new int[]{-1,-1};
    }

}
