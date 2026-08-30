package tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    private LevelOrderTraversal() {}

    // Level-order traversal of a binary tree using a queue
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
    public static void levelOrderTraversal(){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        System.out.println("Level-order traversal:");

        while (!queue.isEmpty()){
            Node cur = queue.poll();
            System.out.println(cur.data + " ");

            if(cur.left != null){
                queue.add(cur.left);
            }

            if(cur.right != null){
                queue.add(cur.right);
            }
        }

        System.out.println();
    }
}
