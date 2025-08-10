package leetcode.shuzu;

public class leetcode45 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        leetcode45 lc = new leetcode45();
        System.out.println(lc.jump(nums));
    }
    public int jump(int[] nums) {
        int count=0;
        //从第0个元素开始 第一次的跳跃是固定的就是nums[0]
        // 然后在[0,nums[0]]的这个区间内 去选择右端点最远的那个
        // 例如nums[0]=4
        // 那么就是选择[0,4]区间内 可以到达右端点最远的那个
        // 比如是6  那么再从[4,6]中选择。。以此类推
        int right = 0; //记录最远可以到达的右端点
        int left =0;//记录当前达到的右端点 作为下一阶段的左端点
        for(int i=0;i<nums.length-1;i++){
            right=Math.max(right,i+nums[i]);// 记录每次能到达的最远
            if(i == left){ // 此时说明已经到当前可以达到的最远点了
                left = right;//将之前的点作为起始点 继续开始遍历搜索
                count++;// 说明此时跳跃了一次
            }
        }
        return count;
    }
}
