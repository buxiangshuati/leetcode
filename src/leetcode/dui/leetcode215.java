package leetcode.dui;

import java.util.ArrayDeque;
import java.util.HashSet;

public class leetcode215 {
    public static void main(String[] args) {
        leetcode215 lc = new leetcode215();
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k =2;
        System.out.println(lc.findKthLargest(nums, k));
    }
    public int findKthLargest(int[] nums, int k) {
        // 使用单调栈来维护一个大小为k的栈
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.push(nums[0]);
        for(int i=1;i<nums.length;i++){
            while(deque.peek() > nums[i]){
                Integer pop = deque.pop();
            }
        }
        return deque.peek();
    }
}

