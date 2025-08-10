package leetcode.hash;

import java.util.HashMap;
import java.util.Map;

public class leetcode383 {
    public static void main(String[] args) {
        String s1 = "aa";
        String s2 = "aab";

        leetcode383 lc = new leetcode383();
        System.out.println(lc.canConstruct(s1,s2));
    }
    public boolean canConstruct(String ransomNote, String magazine) {
//        if (ransomNote.length() > magazine.length()) {
//            return false;
//        }
//        int[] cnt = new int[26];
//        for (char c : magazine.toCharArray()) {
//            cnt[c - 'a']++;
//        }
//        for (char c : ransomNote.toCharArray()) {
//            if (--cnt[c - 'a'] < 0) {
//                return false;
//            }
//        }
//        return true;


        Map<String, Integer> map1 = new HashMap<>();
        for(char c :magazine.toCharArray()){
            if(!map1.containsKey(String.valueOf(c))){
                map1.put(String.valueOf(c),1);
            }else{
                Integer value = map1.get(String.valueOf(c));
                map1.put(String.valueOf(c),value+1);
            }
        }
        for(char c :ransomNote.toCharArray()){
            if(!map1.containsKey(String.valueOf(c))){
                return false;
            }else{
                map1.put(String.valueOf(c),map1.get(String.valueOf(c))-1);
                if(map1.get(String.valueOf(c)) <0){
                    return false;
                }
            }
        }
        return true;
    }
}
