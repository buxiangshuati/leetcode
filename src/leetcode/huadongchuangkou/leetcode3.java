package leetcode.huadongchuangkou;

import java.util.HashMap;

public class leetcode3 {
    public static void main(String[] args) {
        String s = "pwwkew";
        leetcode3 lc = new leetcode3();
        System.out.println(lc.lengthOfLongestSubstring(s));
    }
    public int lengthOfLongestSubstring(String s) {
        char[] ss = s.toCharArray(); // 转化为array 便于操作
        int res =0;  // 用于记录答案
        int left =0; //  记录左端点
        HashMap<Character, Integer> map = new HashMap<>(); // 记录每个字符出现的次数
        for(int right=0;right<s.length();right++){
            char c = ss[right]; // 获取当前字符
            // 更新当前map
            if(!map.containsKey(c)){
                map.put(c,1);
            }else{
                map.put(c,map.get(c)+1);
            }

            while(map.get(c) >1){ // 当出现重复元素时
                map.put(ss[left],map.get(ss[left])-1); // 从左往右以此删除记录的 用于更新下一个答案
                left++;// 移动左指针到当前重复元素处并以此为开始 继续探索；
            }
            res = Math.max(res,right-left+1); // 更新最长数组长度
        }
        return res;
    }
}
