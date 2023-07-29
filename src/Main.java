// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] listNode = {1, 2, 3, 4, 5, 6};
        int index = 1;
        LinkedList linkedList = new LinkedList();
        ListNode head = linkedList.createCircleList(listNode, index);

        boolean res = new 环形链表().hasCycle(head);
        System.out.println(res);
//        while (node != null) {
//            System.out.println(node.val);
//            node = node.next;
//        }
    }
}