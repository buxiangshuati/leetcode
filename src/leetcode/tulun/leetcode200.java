package leetcode.tulun;

public class leetcode200 {
    public static void main(String[] args) {
        char[][] cs = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };
        leetcode200 lc = new leetcode200();
        System.out.println(lc.numIslands(cs));
    }
    public int numIslands(char[][] grid) {
        // 0表示水，1表示陆地
        int ans = 0; // 岛屿数量
        for(int i =0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == '1'){
                    // 对当前位置进行深度优先搜索，遍历所有相连的陆地
                    dfs(grid, i, j);
                    ans++;
                }
            }
        }
        return ans;
    }

    public void dfs(char[][] grid,int i,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j] == '0'){
            return; // 越界或水域
        }
        grid[i][j] = '0'; // 将陆地标记为水域，避免重复访问
        // 递归访问上下左右四个方向
        dfs(grid,i-1,j); // 上
        dfs(grid,i+1,j); // 下
        dfs(grid,i,j-1); // 左
        dfs(grid,i,j+1); // 右
    }
}
//["1","1","0","0","0"]
//["1","1","0","0","0"]
//["0","0","1","0","0"],
//["0","0","0","1","1"]