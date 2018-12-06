package problems;

public class KLargestInBST {
    int curr;
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if (pRoot == null) {
            return null;
        }

        if (k == 0) {
            return null;
        }

        curr = 1;
        return findKRecursive(pRoot, k);
    }

    private TreeNode findKRecursive(TreeNode root, int k) {
        if (root.left == null && root.right == null) {
            if (k == curr) {
                return root;
            } else {
                curr++;
                return null;
            }
        }

        if (root.left != null) {
            TreeNode left = findKRecursive(root.left, k);
            if (left != null) {
                return left;
            }
        }
        if (k == curr) {
            return root;
        }
        curr++;
        if (root.right != null) {
            TreeNode right = findKRecursive(root.right, k);
            if (right != null) {
                return right;
            }
        }
        return null;
    }
}
