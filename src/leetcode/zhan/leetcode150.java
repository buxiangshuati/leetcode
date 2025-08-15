package leetcode.zhan;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;

public class leetcode150 {
    public static void main(String[] args) {
        String[] nums= {"2","1","+","3","*"};
        leetcode150 lc = new leetcode150();
        System.out.println(lc.evalRPN(nums));
    }
    public int evalRPN(String[] tokens) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("+",1);
        map.put("-",1);
        map.put("*",1);
        map.put("/",1);
        Deque<Integer> st = new ArrayDeque<>();
        for(String s:tokens){
            if(!map.containsKey(s)){
                st.push(Integer.valueOf(s));
            }else {
                int x1 = Integer.valueOf(st.pop());
                int x2 = Integer.valueOf(st.pop());
                switch (s){
                    case "+":
                        st.push(x2+x1);
                        break;
                    case "-":
                        st.push(x2-x1);
                        break;
                    case "*":
                        st.push(x2*x1);
                        break;
                    case "/":
                        st.push(x2/x1);
                        break;
                }
            }
        }
        return st.pop();
    }
}
