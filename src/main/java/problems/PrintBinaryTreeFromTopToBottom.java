package problems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintBinaryTreeFromTopToBottom {
        public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            ArrayList<Integer> res = new ArrayList<>();

            if (root == null) {
                return res;
            }

            queue.offer(root);

            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
                res.add(node.val);
            }

            return res;
        }
}
