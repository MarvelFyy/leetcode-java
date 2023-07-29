import java.util.List;

public class LinkedList {

    // 创建单向链表
    public ListNode createLinkedList(int[] listNode) {
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        for (int i = 0; i < listNode.length; i++) {
            p.next = new ListNode(listNode[i]);
            p = p.next;
        }
        return dummy.next;
    }

    // 创建环形链表
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

    // 创建相交链表
    public ListNode[] createIntersectionList(int[] a_list, int[] b_list, int[] common_list) {
        ListNode a_head = createLinkedList(a_list);
        ListNode b_head = createLinkedList(b_list);
        ListNode common_head = createLinkedList(common_list);
        ListNode p1 = a_head, p2 = b_head;

        // 找到链尾
        while (p1.next != null) {
            p1 = p1.next;
        }
        p1.next = common_head;

        while (p2.next != null) {
            p2 = p2.next;
        }
        p2.next = common_head;

        ListNode[] pair = { a_head, b_head };
        return pair;
    }
}
