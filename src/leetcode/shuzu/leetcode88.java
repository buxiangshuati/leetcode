package leetcode.shuzu;

import java.util.Arrays;

public class leetcode88 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,0,0};
        int[] nums2 = {2,5};
        int m=4;
        int n=2;
        leetcode88 test = new leetcode88();
        test.merge(nums1 , m,nums2, n);
        System.out.print(Arrays.toString(nums1));

    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // nums1 的长度为m+n
        // 从尾部开始遍历
        int i = m-1; // nums1 的尾部
        int j = n-1; // nums2 的尾部
        int k = m+n-1; // 整体的尾部

        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                i--;
                k--;
            }else{
                nums1[k]=nums2[j];
                j--;
                k--;
            }
        }
        while(j>0){
            nums1[k]=nums2[j];
            k--;
            j--;
        }
    }

}

