package leetcode.zhizhen;

public class leetcode125 {

    public static void main(String[] args) {
        String s = "0P";
//        System.out.println(0 =='p');
        leetcode125 lc = new leetcode125();
        boolean item = lc.isPalindrome(s);
        System.out.println(item);
    }

    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase();
        String s2 = s1.replaceAll("[^a-z0-9]", "");
        int x =0,y=s2.length()-1;
        while(x<y){
            if(s2.charAt(x) != s2.charAt(y)){
                return false;
            }
            x++;
            y--;
        }
        return true;
    }
}
