package problems;

import java.util.ArrayList;
import java.util.List;

public class UniqueBST2 {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return new ArrayList<TreeNode>();
        }
        return grow(1, n);
    }

    private List<TreeNode> grow(int start, int end) {
        List<TreeNode> result = new ArrayList<>();
        if (start > end) {
            result.add(null);
            return result;
        }

        if (start == end) {
            result.add(new TreeNode(start));
            return result;
        }

        List<TreeNode> left, right;
        for (int i = start; i <= end; i++) {
            left = grow(start, i - 1);
            right = grow(i + 1, end);

            for (TreeNode l : left) {
                for (TreeNode r : right) {
                    TreeNode root = new TreeNode(i);
                    root.left = l;
                    root.right = r;
                    result.add(root);
                }
            }
        }
        return result;
    }
}
