package leetcode.zhizhen;

public class leetcode392 {

    public static void main(String[] args) {

        String s ="abc";
        String t ="abbcd";
        leetcode392 lc = new leetcode392();
        System.out.println(lc.isSubsequence(s,t));

    }
    public boolean isSubsequence(String s, String t) {
        // 定义两个指针 分别对s t进行遍历
        int x = 0,y = 0;
        int count =0;

        // 如果要判断 s是否是t的子序列 那么 s自然的长度就要小于t
        while(x < s.length() && y < t.length()){
            if(s.charAt(x) == t.charAt(y)) {
                count++;
                x++;
                y++;
            }else{
                y++;
            }
        }
        if(count == s.length()){
            return true;
        }
        return false;
    }
}
