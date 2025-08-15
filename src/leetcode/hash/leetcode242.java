package leetcode.hash;

import java.util.Arrays;
import java.util.HashMap;

public class leetcode242 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        leetcode242 lc = new leetcode242();
        System.out.println(lc.isAnagram(s,t));
    }
    public boolean isAnagram(String s, String t) {
//        // 字母异位词  即两个单词 是否存在字母的位置的错乱
//        HashMap<Character, Integer> s2t = new HashMap<>();
//        for (char c:s.toCharArray()){
//            if(!s2t.containsKey(c)){
//                s2t.put(c,1);
//            }else {
//                s2t.put(c,s2t.get(c)+1);
//            }
//        }
//        for (char c:t.toCharArray()){
//            if(s2t.containsKey(c)){
//                s2t.put(c,s2t.get(c)-1);
//            }else if(s2t.get(c) < 0){
//                return false;
//            }
//            else {
//                return false;
//            }
//        }
//        return s2t.values().stream().mapToInt(Integer::intValue).sum() == 0;
        char[] ss = s.toCharArray();
        Arrays.sort(ss);
        String sss = ss.toString();
        System.out.println(sss);
        char[] tt = t.toCharArray();
        Arrays.sort(tt);
        if(Arrays.equals(ss,tt)){
            return true;
        }else {
            return false;
        }
    }
}
