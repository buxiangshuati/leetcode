package leetcode.shuzu;

import java.util.Arrays;

public class leetcode14 {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        leetcode14 lc = new leetcode14();
        System.out.println(lc.longestCommonPrefix(strs));
    }
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int lem = strs.length;
        String res = "";
        for(int i=0;i<strs[0].length();i++){
            if(strs[0].toCharArray()[i] != strs[lem-1].toCharArray()[i]){
                return res;
            }else{
                res += strs[0].toCharArray()[i];
            }
        }
        return null;
    }
}
