public class LinkedList {
    public ListNode createLinkedList(int[] listNode) {
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        for (int i = 0; i < listNode.length; i++) {
            p.next = new ListNode(listNode[i]);
            p = p.next;
        }
        return dummy.next;
    }

    public ListNode createCircleList(int[] listNode, int index) {
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        ListNode circle = null;

        for (int i = 0; i < listNode.length; i++) {
            p.next = new ListNode(listNode[i]);
            if (i == index) {
                circle = p.next;
            }
            p = p.next;
        }
        p.next = circle;

        return dummy.next;
    }
}
