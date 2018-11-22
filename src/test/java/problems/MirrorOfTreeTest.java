package problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class MirrorOfTreeTest {

    @Test
    public void mirror() {
        TreeNode root = new TreeNode(8);
        TreeNode e1 = new TreeNode(6);
        TreeNode e2 = new TreeNode(10);
        TreeNode e3 = new TreeNode(5);
        TreeNode e4 = new TreeNode(7);
        TreeNode e5 = new TreeNode(9);
        TreeNode e6 = new TreeNode(11);

        root.left = e1;
        root.right = e2;
        e1.left = e2;
        e1.right = e4;
        e2.left = e5;
        e2.right = e6;

        MirrorOfTree mot = new MirrorOfTree();
        mot.Mirror(root);

    }
}