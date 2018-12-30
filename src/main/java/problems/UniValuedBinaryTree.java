package problems;

public class UniValuedBinaryTree {
    int rootVal;
    public boolean isUnivalTree(TreeNode root) {
        rootVal = root.val;

        return recursive(root);
    }

    private boolean recursive(TreeNode root) {
        if (root.val == rootVal) {
            if (root.left == null && root.right == null) {
                return true;
            } else {
                boolean left = false, right = false;
                if (root.left == null) left = true;
                if (root.right == null) right = true;
                if (root.left != null) left = recursive(root.left);
                if (root.right != null) right = recursive(root.right);
                return left && right;
            }
        } else return false;
    }
}
