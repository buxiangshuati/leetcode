package leetcode.dongtaiguihua;

public class leetcode5 {
    String res;
    public static void main(String[] args) {
        String s = "babad";
        leetcode5 lc = new leetcode5();
        System.out.println(lc.longestPalindrome(s));
    }
    public String longestPalindrome(String s) {
        res = s.substring(0,1);
        for(int i =0;i<s.length();i++){
            helper(s,i,i);
            helper(s,i,i+1);
        }
        return res;
    }
    public void helper(String s, int left ,int right){
        while(left >=0 && right < s.length() && s.toCharArray()[left] == s.toCharArray()[right]){
            left--;
            right++;
        }
        if(right - left - 1 > res.length()){
            res = s.substring(left+1,right-left-1);
        }
    }
}
