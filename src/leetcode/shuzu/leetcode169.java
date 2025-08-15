package leetcode.shuzu;


import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class leetcode169 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,2,2,3,4};

        leetcode169 lc = new leetcode169();
        int res = lc.majorityElement(nums);
        System.out.println(res);
        System.out.println(Arrays.toString(nums));
    }

    public int majorityElement(int[] nums) {
//        Map<Integer, Integer> map = countNums(nums);
//        Map.Entry<Integer, Integer> majorMap = null;
//
//        for(Map.Entry<Integer,Integer> entity: map.entrySet()){
//            if(majorMap ==null || entity.getValue() > majorMap.getValue()){
//                majorMap = entity;
//            }
//        }
//        return majorMap.getKey();

        /**
         * 使用摩尔投票法进行求解
         */
        int k = 0,score = 0; // 定义k为众数 score记录投票得分情况
        for(int num:nums){
            if(score ==0){
                k = num;
            }
            score += num==k ? 1 : -1;
        }
        return k;
    }

//    public Map<Integer,Integer> countNums(int[] nums){
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int i=0;i< nums.length;i++) {
//            if (!map.containsKey(nums[i])) {
//                map.put(nums[i], 1);
//            } else {
//                map.put(nums[i], map.get(nums[i]) + 1);
//            }
//        }
//        return map;
//    }

}
