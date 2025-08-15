package leetcode.huisu;

import java.util.ArrayList;
import java.util.List;

public class leetcode17 {
    // 首先我们需要一个映射关系 就是每个数字能对应哪几个字母
    public static String[] mapping = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public static void main(String[] args) {
        String s = "23";
        leetcode17 lc = new leetcode17();
//        System.out.println(new String(new char[]{'2','3'}));
        System.out.println(lc.letterCombinations(s));
    }

    public List<String> letterCombinations(String digits) {
        // 这题要求给定一个由数字构成的字符串
        // 比如"23" 然后返回所有可能的字母组合类型
        // 2 ->"abc"  3 ->"efg"  那么返回就有3*3=9种可能性


        int n = digits.length();// 获取给定字符串的长度
        if(n == 0){
            return new ArrayList<String>();
        }
        ArrayList<String> res = new ArrayList<>();
        char[] path = new char[n];
        dfs(0,res,path,digits.toCharArray());
        return res;
    }

    public void dfs(int i , List<String> ans , char[] path, char[] digits){
        if(i == digits.length){  // 当遍历的长度符合要求时
            ans.add(new String(path));// 把当前结果加入最终res
            return;
        }
        String letters = mapping[digits[i] - '0'];// 拿到当前数字对应的字母有哪些
        for(char c: letters.toCharArray()){ // 对于第二个数字对应的字符串 进行遍历组合
            path[i] = c;
            dfs(i+1,ans,path,digits); // 递归调用
        }
    }
}
