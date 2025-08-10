package leetcode.shuzu;

public class leetcode58 {
    public static void main(String[] args) {
        String s = "Hello World";
        leetcode58 lc = new leetcode58();
        System.out.println(lc.lengthOfLastWord(s));
    }
    public int lengthOfLastWord(String s) {
        String[] s1 = s.split(" ");
        String s2 = s1[s1.length-1];
        return s2.length();
    }
}
