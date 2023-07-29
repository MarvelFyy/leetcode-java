public class LinkedList {
    public ListNode createLinkedList(int[] listNode) {
        ListNode head = new ListNode(listNode[0]);
        ListNode p = head;
        for (int i = 1; i < listNode.length; i++) {
            p.next = new ListNode(listNode[i]);
            p = p.next;
        }
        return head;
    }
}
