package leetcode.zhan;

import java.util.ArrayDeque;

public class leetcode394 {
    public static void main(String[] args) {
        String s = "3[a2[bc]]";
        leetcode394 lc = new leetcode394();
        System.out.println(lc.decodeString(s));
    }
    public String decodeString(String s) {
        int num = 0;
        StringBuilder res = new StringBuilder();
        ArrayDeque<Integer> numdeque = new ArrayDeque<>();
        ArrayDeque<StringBuilder> deque = new ArrayDeque<>();
        char[] chars = s.toCharArray();
        for(char c:chars){
            if(Character.isDigit(c)){
                num = num*10 + (c - '0'); // 处理数字
            } else if (c == '['){
                numdeque.push(num); // 将数字入栈
                deque.push(res);
                num = 0; // 重置数字
                res = new StringBuilder(); // 重置结果字符串
            } else if (c == ']') {
                int x = numdeque.pop(); // 弹出数字
                StringBuilder prev = deque.pop();
                for(int i=0;i<x;i++){
                    prev.append(res); // 将当前结果字符串重复x次
                }
                res = prev; // 更新结果字符串为之前的状态
            }else{
                res.append(c); // 处理字母
            }
        }
        return res.toString();
    }

}
