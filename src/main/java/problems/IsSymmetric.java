package problems;

/**
 * Created by Jason Wu on 2017/9/5.
 */
public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        } else {
            return isSymmetricTree(root.left, root.right);
        }
    }

    private boolean isSymmetricTree(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left == null || right == null) {
            return false;
        }

        return left.val == right.val && isSymmetricTree(left.left, right.right) && isSymmetricTree(left.right, right.left);
    }
}
