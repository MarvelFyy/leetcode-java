public class 删除链表的倒数第N个结点 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode p1 = dummy, p2 = dummy;

        for (int i = 0; i < n; i++) {
            p1 = p1.next;
        }

        while (p1.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        p2.next = p2.next.next;

        return dummy.next;
    }
}
