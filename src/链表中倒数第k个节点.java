public class 链表中倒数第k个节点 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode p1 = head, p2 = head;
//        p1 先走 k 步
        for (int i = 0; i < k; i++) {
            p1 = p1.next;
        }

        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p2;
    }
}
