package leetcode.shuzu;

import java.util.Arrays;

public class leetcode134 {
    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost ={3,4,5,1,2};
        leetcode134 lc = new leetcode134();
        System.out.println(lc.canCompleteCircuit(gas,cost));
    }
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // 其余的思路就是 找到最难熬的那一段路
        // 比如当 第i个节点 -> i+1个节点时 其 剩余油量是历史最低的
        // 那么就说明当前是最难的一段路 将节点i+1 作为开始点会比较容易
        int ans =0;
        int minS =0; // 历史最小油量  用于寻找最艰难的路 更新下一节点为开始

        int s=0; // 当前剩余油量
        for(int i=0;i<gas.length;i++){
            s+=gas[i]-cost[i]; // 在i处的油量情况 加油-花费的
            if(s<minS){ // 如果此时剩余油量 是历史最低
                minS = s; // 更新最小油量
                ans = i+1;// 把下一节点作为起始点
            }
        }
        // 判断最后剩余的汽油是否大于0 如果小于 那么就不可能完成
        // 而当sum(gas) > sum(cost)的时候 一定存在一个解 满足要求
        return s<0 ? -1:ans;
    }
}
