package problems;

public class DepthOfBinaryTree {
    private int maxDepth;
    public int TreeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        maxDepth = 1;
        findDepth(root, 1);
        return maxDepth;
    }

    private void findDepth(TreeNode root, int curr) {
        if (root.left == null && root.right == null) {
            if (curr > maxDepth) {
                maxDepth = curr;
            }
        }

        if (root.left != null) findDepth(root.left, curr + 1);
        if (root.right != null) findDepth(root.right, curr + 1);
    }
}
