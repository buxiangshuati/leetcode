package leetcode.lianbiao;

public class leetcode19 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        leetcode19 lc = new leetcode19();
        System.out.println(lc.removeNthFromEnd(node1, 1));
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 想象一下 要获取倒数第n个节点 也就是找到离尾部n格的节点
        // 也就是从头部先走n步 此时两个指针距离就是n 然后两个指针一起走
        // 当前面的指针到达尾部时 此时后面的指针距离它为n 那么所处的位置也就是倒数第n个

        // 创建哨兵节点
        ListNode dummy = new ListNode(0,head);
        ListNode left = dummy;
        ListNode right = dummy;

        while(n-- > 0){
            right = right.next;// 让右指针先走n步
        }
        while(right.next != null){
            left = left.next;
            right = right.next;//左右指针一起走
        }
        // 左指针的下一个节点就是倒数第n个
        left.next = left.next.next;//删除即可,也就是将下下个节点移上来即可

        return dummy.next; // 返回哨兵节点的下一个节点
    }

}
