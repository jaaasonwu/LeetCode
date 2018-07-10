package problems;

import java.util.HashMap;

/**
 * Created by Jason Wu on 2018/7/10.
 */
public class SmallestSubtreeWithAllDeepestNodes {
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        HashMap<TreeNode, Integer> map = new HashMap<>();
        maxDepth(map, root);
        return search(map, root);
    }

    public TreeNode search(HashMap map, TreeNode root) {
        if (root.left == null && root.right == null) {
            return root;
        }

        if ((Integer) map.get(root.left) > (Integer) map.get(root.right)) {
            return search(map, root.left);
        } else if ((Integer) map.get(root.left) < (Integer) map.get(root.right)){
            return search(map, root.right);
        } else {
            return root;
        }
    }


    public void maxDepth(HashMap map, TreeNode root) {
        if (root.left == null && root.right == null) {
            map.put(root, 0);
        }

        if (root.left != null) {
            maxDepth(map, root.left);
        } else {
            map.put(root.left, 0);
        }

        if (root.right != null) {
            maxDepth(map, root.right);
        } else {
            map.put(root.right, 0);
        }

        map.put(root, 1 + Math.max((Integer) map.get(root.left), (Integer) map.get(root.right)));

    }

    TreeNode res = null;
    int deepest = 0;

    public TreeNode subtreeWithAllDeepest2(TreeNode root) {
        dfs(root, 1);
        return res;
    }

    public int dfs(TreeNode root, int level) {
        if (root == null) {
            return level - 1;
        }

        int left = dfs(root.left, level + 1);
        int right = dfs(root.right, level + 1);

        int curr = Math.max(left, right);
        deepest = Math.max(deepest, curr);
        if (left == deepest && right == deepest) {
            res = root;
        }
        return curr;
    }
}
