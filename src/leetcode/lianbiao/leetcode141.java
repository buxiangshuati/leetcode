package leetcode.lianbiao;

public class leetcode141 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static void main(String[] args) {
        ListNode node = new ListNode(3);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(-4);

        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node1;

        leetcode141 lc = new leetcode141();
        System.out.println(lc.hasCycle(node));
    }
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next==null){
            return false;
        }
        // 定义快慢指针
        // 如果这是一个环形链表 那么两个不同速度的指针
        // 快的那个指针 肯定会在后来某一时刻 追上慢指针（套圈）
        ListNode fast =head,slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next; // 慢指针一次移动一步
            fast = fast.next.next;// 快指针一次移动两步

            if(slow == fast){ // 如果两个指针相遇 那么就说明有环
                return true;
            }
        }
        // 如果没有环 那么这个while会很快结束 那么返回false即可
        return false;
    }
}
