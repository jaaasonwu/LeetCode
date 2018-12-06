package problems;

public class IsTreeBalanced {
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null) return true;
        int level = isBalancedRecursive(root);
        return !(level == -1);
    }

    private int isBalancedRecursive(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = 0, right = 0;
        if (root.left != null) left = isBalancedRecursive(root.left);
        if (left == -1) return -1;

        if (root.right != null) right = isBalancedRecursive(root.right);
        if (right == -1) return -1;
        if (Math.max(left, right) - Math.min(left, right) > 1) {
            return -1;
        } else {
            return Math.max(left, right) + 1;
        }
    }
}
