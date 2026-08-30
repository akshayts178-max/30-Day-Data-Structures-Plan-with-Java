package linkedList;

public class SinglyLinkedList {
    private SinglyLinkedList() {}

    // Implement a singly linked list (insert/print)
    public static void implementSinglyLinkedList(int[] arr) {
        Node head = null;
        Node tail = null;

        for (int value : arr) {
            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        Node cur = head;
        System.out.println("Singly linked list: ");

        while (cur != null) {
            System.out.print(cur.data);

            if (cur.next != null) {
                System.out.print(" -> ");
            }

            cur = cur.next;
        }

        System.out.println();
    }

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
