package leetcode.erfen;

public class leetcode33 {
    public static void main(String[] args) {
        leetcode33 lc = new leetcode33();
        System.out.println(lc.search(new int[]{3,1}, 1));
    }
    public int search(int[] nums, int target) {
        int left =0;
        int right = nums.length-1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target){
                return mid; // 如果找到目标值，返回其索引
            }
            // 否则去判断部分有序
            if(nums[left] <= nums[mid]){
                // 说明左边有序
                if(nums[left] <= target && nums[mid] > target) {
                    // 说明目标值在左边
                    right = mid - 1; // 向左查找
                }else{
                    // 说明在右半部分
                    left = mid + 1;
                }
            }else{
                // 说明右边有序
                if(nums[right] >= target && nums[mid] < target) {
                    // 说明目标值在右边
                    left = mid + 1; // 向左查找
                }else{
                    // 说明在右半部分
                    right = mid - 1;
                }
            }
        }
        return -1; // 如果没有找到目标值，返回 -1
    }
}
