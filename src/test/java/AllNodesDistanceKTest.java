import org.junit.Test;
import problems.AllNodesDistanceK;
import problems.TreeNode;

import java.util.List;

import static util.Utils.generateTree;

public class AllNodesDistanceKTest {
    @Test
    public void distanceKTest() {
        Integer[] tree = new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4};
        TreeNode root = generateTree(tree, 0);
        AllNodesDistanceK distanceK = new AllNodesDistanceK();
        List<Integer> list = distanceK.distanceK(root, root.left, 2);
        System.out.println(list);
    }
}
