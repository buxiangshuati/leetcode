package leetcode.zhan;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class leetcode20 {
    public static void main(String[] args) {
        String s = "((())())";
        leetcode20 lc = new leetcode20();
        System.out.println(lc.isValid(s));
    }

    public boolean isValid(String s) {
        if(s.length()%2 !=0){
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{'); // 用于储存右括号的配对关系

        Deque<Character> st = new ArrayDeque<>();// 栈的创建
        for(char c:s.toCharArray()){
            if(!map.containsKey(c)){ // 因为我们的map中存的是右括号
                st.push(c); // 所以当key不存在时 就说明输入的说左括号 我们将其入栈
            }else if(st.isEmpty() || st.pop() != map.get(c)){ // 如果当前栈已经空了 或者说 栈顶元素与当前括号不匹配
                return false;   // 那么直接返回false即可
            }
        }
        return st.isEmpty();
    }

}
