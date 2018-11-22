package problems;

public class SameSubtree {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root1 == null) {
            return false;
        }

        if (root2 == null) {
            return false;
        }

        if (sameTree(root1, root2)) {
            return true;
        } else {
            return HasSubtree(root1.left, root2)
                    || HasSubtree(root1.right, root2);
        }
    }

    private boolean sameTree(TreeNode root1, TreeNode root2) {
        if (root2 == null) {
            return true;
        } else if (root1 != null) {
            if (root1.val == root2.val) {
                return sameTree(root1.left, root2.left)
                        && sameTree(root1.right, root2.right);
            }
        }

        return false;
    }
}
