package leetcode.hash;

import java.util.Arrays;
import java.util.HashMap;

public class leetcode205 {
    public static void main(String[] args) {
        String s = "paper";
        String t = "title";
        leetcode205 lc = new leetcode205();
        System.out.println(lc.isIsomorphic(s,t));
    }
    public boolean isIsomorphic(String s, String t) {
        // 方法中只判断了一种单向的映射关系 所以需要调用两次
        // t -> s 的映射关系需要也调用一次
        return isHelper(s,t)&&isHelper(t,s);
    }
    public boolean isHelper(String s, String t){
        // 这个方法只判断了一种单向的映射 就是s -> t的
        HashMap<Character, Character> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(!map.containsKey(c1)){
                map.put(c1,c2);
            }else{
                if(map.get(c1) !=c2){
                    return false;
                }
            }
        }
        return true;
    }
}
