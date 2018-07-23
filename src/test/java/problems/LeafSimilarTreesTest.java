package problems;

import org.junit.Test;
import util.Utils;

public class LeafSimilarTreesTest {

    @Test
    public void leafSimilar() {
        TreeNode t1 = Utils.generateTree(new Integer[]{3, 5, 1, 6, 2, 9, 8, null, null, 7, 4}, 0);
        TreeNode t2 = Utils.generateTree(new Integer[]{3,5,1,6,7,4,2,null,null,null,null,null,null,9,8}, 0);

        LeafSimilarTrees p1 = new LeafSimilarTrees();
        p1.leafSimilar(t1, t2);
    }
}