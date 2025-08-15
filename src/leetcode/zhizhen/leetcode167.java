package leetcode.zhizhen;

import java.util.ArrayList;
import java.util.Arrays;

public class leetcode167 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 4, 5,8,9};
        int target = 7;
        leetcode167 lc = new leetcode167();
        System.out.println(Arrays.toString(lc.twoSum(numbers,target)));
    }

    public int[] twoSum(int[] numbers, int target) {
        //暴力循环 但是超时
//        int x = 0;
//        while (x < numbers.length - 1) {
//            for(int y =x+1;y<numbers.length;y++){
//                if (numbers[x] + numbers[y] == target) {
//                    return new int[]{x+1,y+1};
//                }
//            }
//            x++;
//        }
//        return null;

        int x = 0;
        int y = numbers.length-1;
        while (true){
            int sum = numbers[x] + numbers[y];
            if(sum == target){
                return new int[]{x+1,y+1};
            }
            if(sum >target){
                y--;
            }else{
                x++;
            }
        }
    }
}


