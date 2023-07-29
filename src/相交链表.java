import org.w3c.dom.ls.LSInput;

public class 相交链表 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA, q = headB;

        while (p != q) {
            p = (p != null) ? p.next : headB;
            q = (q != null) ? q.next : headA;
        }
        return p;
    }
}
