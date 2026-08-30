package linkedlist;

public class SinglyLinkedList {
    private SinglyLinkedList() {}

    // Implement a singly linked list (insert/print)
    public static void implementSinglyLinkedList(int[] arr) {
        ListNode head = null;
        ListNode tail = null;

        for (int value : arr) {
            ListNode newNode = new ListNode(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        System.out.println("Singly linked list: ");
        LinkedListUtils.printList(head);
    }
}
