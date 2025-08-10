package leetcode.tulun;

import java.util.ArrayList;

public class leetcode994 {
    public static void main(String[] args) {
        int[][] grid = {
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };
        leetcode994 lc = new leetcode994();
        System.out.println(lc.orangesRotting(grid));
    }

    public int orangesRotting(int[][] grid) {
        // 获取grid大小
        int m = grid.length, n = grid[0].length;
        // 新鲜橘子数量
        int fresh = 0;
        // 用于记录腐烂的橘子的坐标
        ArrayList<int[]> queue = new ArrayList<>();
        // 统计新鲜橘子数量和腐烂橘子的坐标
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    queue.add(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }
        if(fresh == 0){
            return 0; // 没有新鲜橘子，直接返回0
        }
        int minutes = 0; // 记录腐烂所需的分钟数
        //定义四个方向
        int[][] dir = {
                {0, 1}, // 右
                {1, 0}, // 下
                {0, -1}, // 左
                {-1, 0} // 上
        };

        // 当腐烂的橘子不为空，开始BFS
        while(!queue.isEmpty()){
            int size = queue.size();
            boolean rotted = false; // 标记是否有橘子腐烂

            for(int i=0;i<size;i++){
                int[] current = queue.remove(0);
                int x = current[0], y = current[1];
                for(int[] d: dir){
                    int nx = x + d[0];//新的坐标行
                    int ny = y + d[1];
                    if(nx >=0 && nx<m && ny >=0 && ny<n && grid[nx][ny] == 1){ //必须保证不越界，且新鲜橘子存在
                        // 新鲜橘子被腐烂
                        grid[nx][ny] = 2; // 标记为腐烂
                        queue.add(new int[]{nx, ny}); // 将新腐烂的橘子加入队列
                        fresh--; // 新鲜橘子数量减少
                        rotted = true; // 标记有橘子腐烂
                    }
                }
            }
            if(rotted){
                minutes++; // 如果有橘子腐烂，分钟数增加
            }
        }
        return fresh == 0 ? minutes : -1; // 如果所有新鲜橘子都腐烂了，返回分钟数，否则返回-1表示无法全部腐烂
    }
}
