package leetcode.shuzu;

import java.util.HashMap;

public class leetcode12 {
    public static void main(String[] args) {
        int num = 4;
        leetcode12 lc = new leetcode12();
        System.out.println(lc.intToRoman(num));
    }
    public String intToRoman(int num) {
        // 新建一个String数组 进行各个位数的字母与数字对应
        String[][] strings = {
                {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"}, // 个位
                {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"}, // 十位
                {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"}, // 百位
                {"","M","MM","MMM"}//千位
        };
        return strings[3][num/1000]+strings[2][num / 100 % 10]+strings[1][num/10%10]+strings[0][num%10];
    }
}
