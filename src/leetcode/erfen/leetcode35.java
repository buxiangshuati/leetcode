package leetcode.erfen;

public class leetcode35 {
    public static void main(String[] args) {
        int[] nums ={1,3,5,6};
        int target = 2;
        leetcode35 lc = new leetcode35();
        System.out.println(lc.searchInsert(nums,target));
    }
    public int searchInsert(int[] nums, int target) {
        // 这是一个有顺序的数组
        // 需要插入的数 应该判断位于哪个区间内
        return lowerBound(nums,target);


    }
    public int lowerBound(int[] nums , int target){
        // 那么定义头尾指针 不断缩小范围
        int left = 0;
        int right = nums.length - 1; // 闭区间 [left, right]
        while (left <= right) { // 区间不为空
            int mid = left + (right - left) / 2; // 找到中间值
            if (nums[mid] < target) { // 如果目标值大于中间值 说明目标值位于 [mid , right]区间内 此时需要将left增加
                left = mid + 1; // 范围缩小到 [mid+1, right]
            } else {// 不然就说明目标位于 [left,mid]区间内 此时需要将right缩小
                right = mid - 1; // 范围缩小到 [left, mid-1]
            }
        }
        return left;
    }
}
