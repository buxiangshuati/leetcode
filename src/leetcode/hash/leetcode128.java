package leetcode.hash;

import java.util.*;

public class leetcode128 {
    public static void main(String[] args) {
        int[] nums = {9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6};
        //{-1,-1,0,1,3,4,5,6,7,8,9}
        leetcode128 lc = new leetcode128();
        System.out.println(lc.longestConsecutive(nums));
    }
    public int longestConsecutive(int[] nums) {
        // 如果排序的话 复杂度会上升到O(N logN)
//        Arrays.sort(nums);
//        int x =0, y=1;
//        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
//        map.put(1,new ArrayList<>());
//        int l = 1;
//        while(x < nums.length-1){
//            if(nums[y]-nums[x]==1){
//                l++;
//                x++;
//                y++;
//            }else if(nums[y]-nums[x]==0){
//                x++;
//                y++;
//            }
//            else {
//                map.get(1).add(l);
//                x = y;
//                y += 1;
//                l=1;
//            }
//        }
//        map.get(1).add(l);
//        return Collections.max(map.get(1));

        // 不排序的方法
        HashSet<Integer> st = new HashSet<>();
        int ans = 0;
        for(int num: nums){
            st.add(num); // 转换成hash集合储存  过滤掉重复元素
        }
        for(int x:st){
            if(st.contains(x-1)){
                continue; // 找到连续序列的开始位置 即 与上一个不连续的元素
            }
            // 现在的x就是开始位置
            int y =x+1; // 定义右端点 用于计算范围  y是一个数字 直接比较
            while(st.contains(y)){
                y++; // y如果在集合内 那就继续增加
            }
            ans = Math.max(ans,y-x); // 更新最大长度
        }
        return ans;
    }

}
