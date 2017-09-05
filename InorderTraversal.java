import java.util.LinkedList;
import java.util.List;

/**
 * Created by Jason Wu on 2017/9/5.
 */
public class InorderTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        recursiveTraversal(root, result);
        return result;
    }

    private void recursiveTraversal(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        recursiveTraversal(root.left, result);
        result.add(root.val);
        recursiveTraversal(root.right, result);
    }
}
