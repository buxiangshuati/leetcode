package leetcode.shuzu;

import java.util.Arrays;
import java.util.stream.IntStream;

public class leetcode274 {
    public static void main(String[] args) {
        int[] citations = {1};
        leetcode274 lc = new leetcode274();
        System.out.println(lc.hIndex(citations));
    }
    public int hIndex(int[] citations) {
        int h=0;
        Arrays.sort(citations);
        for(int i=citations.length-1;i>=0;i--){
            if(citations[i]>h){
                h++;
            }
        }
        return h;
    }
}
