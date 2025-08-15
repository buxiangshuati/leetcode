package leetcode.shuzu;

public class leetcode41 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 0,-1,1};
        leetcode41 lc = new leetcode41();
        System.out.println(lc.firstMissingPositive(nums));
    }

    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            while (1 <= nums[i] && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
                // 这里 1 <= nums[i] && nums[i] <= n 用于限定判断范围
                // 只对那些在范围内的数字进行操作
                // nums[i] != nums[nums[i] - 1] 用于判断当前元素是否在其应该在的位置上
                int j = nums[i] - 1; // 计算应该放置的位置
                int temp = nums[i];
                nums[i] = nums[j]; // 交换当前元素和它应该在的位置上的元素
                nums[j] = temp; // 完成交换
            }
        }
        // 上述操作是为了对所有的元素进行排序
        for(int i =0;i<n;i++){
            // 下面开始寻找第一个不匹配的元素
            if(nums[i] != i+1){
                return i+1;
            }
        }
        // 当所有元素都在正确位置时，返回 n+1
        return n+1;
    }
}
