package leetcode.hash;

import java.util.HashMap;
import java.util.Map;

public class leetcode290 {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog fish fish dog";
        leetcode290 lc = new leetcode290();
        System.out.println(lc.wordPattern(pattern,s));
    }
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map1 = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();
        char[] pa = pattern.toCharArray();
        String[] s1 = s.split(" ");
        if(pa.length != s1.length){
            return false;
        }
        for(int i=0;i<s1.length;i++){
            if(!map1.containsKey(pa[i]) && !map2.containsKey(s1[i])){
                map1.put(pa[i],s1[i]);
                map2.put(s1[i],pa[i]);
            }
            if(map1.containsKey(pa[i]) && !map1.get(pa[i]).equals(s1[i])){
                return false;
            }
            if(map2.containsKey(s1[i]) && map2.get(s1[i]) != (pa[i])){
                return false;
            }
        }
        return true;
    }
}
