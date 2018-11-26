package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class BinaryTreePathWithSpecificSum {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        if (root == null) {
            return res;
        }

        stack.push(new Node(null, root, root.val));
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            if (node.sum == target && node.treeNode.left == null && node.treeNode.right == null) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(node.treeNode.val);
                while (node.parent != null) {
                    node = node.parent;
                    list.add(node.treeNode.val);
                }
                Collections.reverse(list);
                res.add(list);
                continue;
            }
            TreeNode treeNode = node.treeNode;
            if (treeNode.left != null) {
                stack.push(new Node(node, treeNode.left, node.sum + treeNode.left.val));
            }

            if (treeNode.right != null) {
                stack.push(new Node(node, treeNode.right, node.sum + treeNode.right.val));
            }
        }

        Collections.reverse(res);
        return res;
    }
}

class Node {
    Node parent;
    TreeNode treeNode;
    int sum;

    Node(Node parent, TreeNode treeNode, int sum) {
        this.parent = parent;
        this.treeNode = treeNode;
        this.sum = sum;
    }
}


