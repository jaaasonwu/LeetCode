package problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class BSTToDoublyLinkedListTest {

    @Test
    public void convert() {
        BSTToDoublyLinkedList bst = new BSTToDoublyLinkedList();
        TreeNode root = new TreeNode(10);
        TreeNode node1 = new TreeNode(6);
        TreeNode node2 = new TreeNode(14);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(8);
        TreeNode node5 = new TreeNode(12);
        TreeNode node6 = new TreeNode(16);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        bst.Convert(root);
    }
}