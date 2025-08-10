package leetcode.shuzu;

public class leetcode55 {
    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};
        leetcode55 lc = new leetcode55();
        System.out.println(lc.canJump(nums));
    }
    public boolean canJump(int[] nums) {
        // 每次记录最远可以到达的下标位置
        // 可以表示为 当前下标值i + nums[i]
        int mx =0;
        for(int i =0;i<nums.length;i++){
            // 如果当前下标位置已经超出之前的能到达的最远位置
            // 则说明当前位置已无法到达
            if(i > mx){
                return false;
            }
            mx = Math.max(mx,nums[i]+i);
        }
        return true;
    }
}
