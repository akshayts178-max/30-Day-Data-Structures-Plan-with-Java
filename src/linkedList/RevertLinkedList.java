package linkedList;

public class RevertLinkedList {
    private RevertLinkedList() {}

    // Reverse a linked list
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void revertLinkedList(){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        System.out.println("Original LinkedList:");
        printList(head);

        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
        System.out.println("Reverted LinkedList:");
        printList(head);
    }

    private static void printList(Node head){
        Node curr = head;

        while(curr.next != null){
            System.out.print(curr.data);

            System.out.print(" -> ");

            curr = curr.next;
        }
        System.out.println();
    }
}
