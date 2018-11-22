package problems;

public class MirrorOfTree {
    public void Mirror(TreeNode root) {
        if (root == null) {
            return;
        }
        root = mirrorTree(root);
    }

    private TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return root;
        }

        if (root.left == null && root.right == null) {
            return root;
        }


        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        root.left = mirrorTree(root.left);
        root.right = mirrorTree(root.right);
        return root;
    }
}
