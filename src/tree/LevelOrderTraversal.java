package tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    private LevelOrderTraversal() {}

    // Level-order traversal of a binary tree using a queue
    public static void levelOrderTraversal(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        System.out.println("Level-order traversal:");

        while (!queue.isEmpty()){
            TreeNode cur = queue.poll();
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
