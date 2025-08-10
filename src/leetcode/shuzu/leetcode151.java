package leetcode.shuzu;

public class leetcode151 {
    public static void main(String[] args) {
        String s = "  hello   world  ";
        leetcode151 lc = new leetcode151();
//        System.out.println(s.strip());
        System.out.println(lc.reverseWords(s));
//        System.out.println(s.strip());
    }
    public String reverseWords(String s) {
        String[] s1 = s.split(" ");
        String res = "";
        int count = 0;
        for(int i= s1.length-1;i>=0;i--){
            if(s1[i].equals("") && count==0){
                res += s1[i];
                count = 1;
            }else if(s1[i].equals("") && count==1){
                continue;
            }else {
                res += s1[i]+" ";
                count =0;
            }
        }
        return res.trim();
    }
}
