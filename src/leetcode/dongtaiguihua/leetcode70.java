package leetcode.dongtaiguihua;

public class leetcode70 {
    public static void main(String[] args) {
        leetcode70 lc = new leetcode70();
        System.out.println(lc.climbStairs(4));
    }
    public int climbStairs(int n) {
        int[] l = new int[n+1];
        l[0]=1;
        l[1]=2;
        for(int i =2;i<n+1;i++){
            l[i] = l[i-1]+l[i-2];
        }
        return l[n-1];
    }
}
