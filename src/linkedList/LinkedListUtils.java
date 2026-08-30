package linkedList;

public class LinkedListUtils {
    private LinkedListUtils() {}

    public static void printList(ListNode head) {
        ListNode curr = head;

        while (curr != null) {
            System.out.print(curr.data);

            if (curr.next != null) {
                System.out.print(" -> ");
            }

            curr = curr.next;
        }
        System.out.println();
    }
}
