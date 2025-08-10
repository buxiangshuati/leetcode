package leetcode.erchashu;

public class leetcode100 {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(3);
        q.right = new TreeNode(2);

        leetcode100 lc = new leetcode100();
        System.out.println(lc.isSameTree(p,q));
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // 判断两棵树是否相同
        // 首先考虑 如果当前p节点为null 另一个q不为null
        // 那么此时肯定返回false
        // 如果当前 p,q都为null 也判断
        if(p == null || q == null){
            return p==q; // 返回即可(如果一个空 一个非空 肯定是false)
        }
        // 如果都不为null 那么 判断值是否相等即可
        return p.val == q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
