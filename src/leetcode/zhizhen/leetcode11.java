package leetcode.zhizhen;

public class leetcode11 {

    public static void main(String[] args) {

        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        leetcode11 lc = new leetcode11();
        System.out.println(lc.maxArea(height));

    }

    public int maxArea(int[] height) {
        /**
         * 一个容器能盛多少水 其实是由它的短板决定的
         *  V = 短板高度 H * 两板之间的距离 S || V = H * S
         * 所以我们考虑从两边向内进行移动
         * 那么继续来想 到底是移动短板 还是 长板？
         * 如果我们尝试移动长板 那么当长板向内移动时 如果碰到了更短的板 那么盛水容量肯定下降
         * 因为不仅板高度变低了 连距离也缩短了
         * 而如果碰到了更高的板 盛水的容量也不一定上升 因为短板固定！！
         *
         * 下面考虑移动短板  当短板向内移动时 如果碰到了更高的板 那就有可能提升容量
         * 因为虽然向内移动减少了S 但是H上升了 因此会出现 V上升的情况
          */
        int x = 0 , y = height.length-1; // 定义头尾指针
        int V=0;
        while(x<y){
            int V1 = Math.min(height[x],height[y])*(y-x);
            if(V1>V){
                V=V1;
            }
            if(height[x] > height[y]){
                y--;
            }else {
                x++;
            }
        }
        return V;
    }
}
