import org.junit.Test;
import problems.AllNodesDistanceK;
import problems.TreeNode;

import java.util.List;

public class AllNodesDistanceKTest {
    @Test
    public void distanceKTest() {
        Integer[] tree = new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4};
        TreeNode root = generateTree(tree, 0);
        AllNodesDistanceK distanceK = new AllNodesDistanceK();
        List<Integer> list = distanceK.distanceK(root, root.left, 2);
        System.out.println(list);
    }

    private TreeNode generateTree(Integer[] tree, int i) {
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
