package leetcode.erchashu;



public class leetcode104 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        leetcode104 lc = new leetcode104();
        System.out.println(lc.maxDepth(root));
    }

    public int maxDepth(TreeNode root) {
        // 遍历到叶子节点了 就返回0
        if(root == null){
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        // 假设这一步已经遍历到了叶子节点 那么其不存在更多的叶子节点
        // 因此返回值left right都会是0
        // 所以从这一步开始往回推 每次都是+1
        // 叶子节点返回的就是1
        return Math.max(left,right)+1;
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
