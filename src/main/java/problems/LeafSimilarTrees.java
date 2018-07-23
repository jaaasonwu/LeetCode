package problems;

import java.util.ArrayList;

public class LeafSimilarTrees {
    ArrayList<TreeNode> list1;
    ArrayList<TreeNode> list2;
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
        addLeaf(root1, list1);
        addLeaf(root2, list2);
        if (list1.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).val != list2.get(i).val) {
                return false;
            }
        }
        return true;
    }

    private void addLeaf(TreeNode root, ArrayList<TreeNode> list) {
        if (root.left == null && root.right == null) {
            list.add(root);
        }
        if (root.left != null) addLeaf(root.left, list);
        if (root.right != null) addLeaf(root.right, list);
    }
}
