package leetcode.shuzu;

import java.util.HashMap;
import java.util.Map;

public class leetcode13 {
    public static void main(String[] args) {
        String s ="LVIII";
        leetcode13 lc = new leetcode13();
        System.out.println(lc.romanToInt(s));
    }
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        char[] c = s.toCharArray();
        int ans =0;
        for(int i=1;i<c.length;i++){
            Integer x = map.get(c[i - 1]);
            Integer y = map.get(c[i]);
            ans += x<y ? -x : x;
        }
        ans += map.get(c[c.length-1]);
        return ans;
    }
}
