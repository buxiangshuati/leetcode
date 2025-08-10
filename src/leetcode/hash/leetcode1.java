package leetcode.hash;

import java.util.Arrays;
import java.util.HashMap;

public class leetcode1 {
    public static void main(String[] args) {
        int[] nums ={2,7,11,15};
        int target = 9;
        leetcode1 lc = new leetcode1();
        System.out.println(Arrays.toString(lc.twoSum(nums,target)));
    }
    public int[] twoSum(int[] nums, int target) {
        // 创建一个hashmap 储存每个元素与其对应的下标
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int x = nums[i];
            if(map.containsKey(target-x)){
                return new int[]{map.get(target-x),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
