package problems;

import org.junit.Test;

public class KLargestInBSTTest {

    @Test
    public void kthNode() {
        TreeNode root = new TreeNode(5);
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(1);

        root.left = node1;
        node1.left = node2;
        node2.left = node3;
        node3.left = node4;

        KLargestInBST kl = new KLargestInBST();
        assert kl.KthNode(root, 3).val == 3;
    }
}