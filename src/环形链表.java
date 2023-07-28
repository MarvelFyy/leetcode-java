public class 环形链表 {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            head = head.next;

            if (fast == head) {
                return true;
            }
        }

        return  false;
    }
}
