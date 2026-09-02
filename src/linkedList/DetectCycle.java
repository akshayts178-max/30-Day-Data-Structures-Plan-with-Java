package linkedList;

public class DetectCycle {
    private DetectCycle() {}

    // Detect a cycle in a linked list
    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void detectCycle() {
        ListNode node1 = new ListNode(10);
        ListNode node2 = new ListNode(20);
        ListNode node3 = new ListNode(30);
        ListNode node4 = new ListNode(40);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;
        ListNode fast = node1;
        ListNode slow = node1;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                System.out.println("Cycle Detected");
                return;
            }
        }

        System.out.println("Cycle Not Detected");
    }
}
