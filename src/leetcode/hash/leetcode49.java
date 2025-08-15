package leetcode.hash;

import com.sun.jdi.ArrayReference;

import java.util.*;

public class leetcode49 {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        leetcode49 lc = new leetcode49();
        System.out.println(lc.groupAnagrams(strs));
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s:strs){
            char[] ss = s.toCharArray();
            Arrays.sort(ss);
            if(!map.containsKey(new String(ss))){
                map.put(new String(ss), new ArrayList<>(Arrays.asList(s)));
            }else{
                map.get(new String(ss)).add(s);
            }
        }
        return new ArrayList<>(map.values());
    }
}
