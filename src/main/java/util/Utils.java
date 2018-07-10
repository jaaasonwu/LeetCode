package util;

import problems.TreeNode;

/**
 * Created by Jason Wu on 2018/7/10.
 */
public class Utils {
    public static TreeNode generateTree(Integer[] tree, int i) {
        if (i >= tree.length || tree[i] == null) {
            return null;
        }
        TreeNode root = new TreeNode(tree[i]);
        if (i * 2 + 1 < tree.length) {
            root.left = generateTree(tree, i * 2 + 1);
        } else {
            root.left = null;
        }
        if (i * 2 + 2 < tree.length) {
            root.right = generateTree(tree, i * 2 + 2);
        } else {
            root.right = null;
        }
        return root;
    }
}
