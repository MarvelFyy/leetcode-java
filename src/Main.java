// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] listNode = {1, 2, 3, 4, 5, 6};
        int n = 3;
        LinkedList linkedList = new LinkedList();
        ListNode head = linkedList.createLinkedList(listNode);

        ListNode node = new 链表的中间结点().middleNode(head);
        System.out.println(node.val);
//        while (node != null) {
//            System.out.println(node.val);
//            node = node.next;
//        }
    }
}