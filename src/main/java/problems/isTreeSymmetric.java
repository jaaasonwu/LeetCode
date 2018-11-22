package problems;

public class isTreeSymmetric {
    boolean isSymmetrical(TreeNode pRoot)
    {
        return isSym(pRoot, pRoot);
    }

    private boolean isSym(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }

        if (root1 == null || root2 == null) {
            return false;
        }

        if (root1.val != root2.val) {
            return false;
        }

        return isSym(root1.left, root2.right)
                && isSym(root1.right, root2.left);
    }
}
