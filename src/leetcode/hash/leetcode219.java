package leetcode.hash;

import java.util.HashMap;
import java.util.Map;

public class leetcode219 {
    public static void main(String[] args) {
        int[] nums ={1,2,3,1};
        int k = 3;
        leetcode219 lc = new leetcode219();
        System.out.println(lc.containsNearbyDuplicate(nums,k));
    }
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();// key为元素值  value为下标
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]) && Math.abs(map.get(nums[i])-i)<=k){
                return true;
            }else {
                map.put(nums[i],i);
            }
        }
        return false;
    }
}
