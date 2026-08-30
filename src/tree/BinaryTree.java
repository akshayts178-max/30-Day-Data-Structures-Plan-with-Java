package tree;

public class BinaryTree {
    private BinaryTree() {}

    // Build a binary tree and do inorder traversal
    public static void buildBinaryTree(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println("Inorder traversal:");
        TreeUtils.inorder(root);
        System.out.println();
    }
}
