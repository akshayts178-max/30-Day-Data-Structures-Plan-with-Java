package linkedlist;

public class RevertLinkedList {
    private RevertLinkedList() {}

    // Reverse a linked list
    public static void revertLinkedList(){
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        System.out.println("Original LinkedList:");
        LinkedListUtils.printList(head);

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
        System.out.println("Reverted LinkedList:");
        LinkedListUtils.printList(head);
    }
}
