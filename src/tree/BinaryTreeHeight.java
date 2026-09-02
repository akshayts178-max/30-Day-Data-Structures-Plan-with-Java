package tree;

public class BinaryTreeHeight {
    private BinaryTreeHeight() {}

    // Find the height of a binary tree
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static void findBinaryTreeHeight(){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(6);
        int height = findHeight(root);
        System.out.println("Binary Tree Height : " + height);
    }

    private static int findHeight(Node root){
        if(root == null){
            return 0;
        }

        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
