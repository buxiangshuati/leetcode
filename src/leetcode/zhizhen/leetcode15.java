package leetcode.zhizhen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode15 {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        leetcode15 lc = new leetcode15();
        System.out.println(lc.threeSum(nums));
    }
    public List<List<Integer>> threeSum(int[] nums) {
        // 对数组进行排序
        Arrays.sort(nums);
        // 三数之和 nums[i]+nums[j]+nums[k]==0
        // 那么就可以转换成 nums[i] == -nums[j]-nums[k]
        // 相当于题目又变成了两数之和
        List<List<Integer>> ans = new ArrayList<>();
        int n =nums.length;
        for(int i =0;i<n-2;i++){
            int x =nums[i];
            if(i >0 && x==nums[i-1]){
                continue; // 跳过重复解
            }
            if(x+nums[i+1]+nums[i+2] >0 ) break;  // 优化1 当此时x与最小的两个元素值已经大于0时 直接退出即可 因为此时后面所有的数都会大于0
            if(x+nums[n-1]+nums[n-2] <0) continue;// 优化2 当此时x与最大的两个元素值相加小于0时 直接跳出循环进行下一个i即可 因为此时i过于小
            int j =i+1;
            int k =n-1;
            while(j<k){
                int s = x+nums[j]+nums[k];
                if(s>0){
                    k--;
                }else if(s<0){
                    j++;
                }else {
                    ans.add(new ArrayList<>(Arrays.asList(x,nums[j],nums[k])));
//                    for (j++; j < k && nums[j] == nums[j - 1]; j++); // 跳过重复数字
                    j++; // 先移动一位 j
                    while(j<k && nums[j] == nums[j-1]){
                        j++; // 如果此时j仍然小于k 并且此时j对应的元素重复了 那么就继续移动
                    }
                    // k同理 也是继续移动以去除重复元素
                    for (k--; k > j && nums[k] == nums[k + 1]; k--); // 跳过重复数字
                }
            }
        }
        return ans;
    }
}
