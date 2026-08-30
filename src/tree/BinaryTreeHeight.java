package tree;

public class BinaryTreeHeight {
    private BinaryTreeHeight() {}

    // Find the height of a binary tree
    public static void findBinaryTreeHeight(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(6);
        int height = TreeUtils.findHeight(root);
        System.out.println("Binary Tree Height : " + height);
    }
}
