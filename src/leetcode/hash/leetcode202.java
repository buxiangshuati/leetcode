package leetcode.hash;

import java.util.HashMap;

public class leetcode202 {
    public static void main(String[] args) {
        int n = 7;
        leetcode202 lc = new leetcode202();
        System.out.println(lc.isHappy(n));
    }
    public boolean isHappy(int n) {
        // 定义快慢指针 看是否有环
        int slow = n,fast =n;
        do {
            slow = helper(slow);
            fast = helper(helper(fast));
        }while (slow != fast);

        return slow==1;
//        int res = n;
//        HashMap<Integer, Integer> map = new HashMap<>();
//        while (res !=1){
//            if(map.containsKey(res)){
//                return false;
//            }
//            map.put(res,1);
//            res = helper(res);
//
//        }
//        return true;
    }
    public int helper(int n){
        int sum = 0;
        while (n>0){
            int bit =n % 10;
            sum += bit*bit;
            n=n/10;
        }
        return sum;
    }
}
