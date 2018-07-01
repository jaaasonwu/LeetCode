package problems;

import java.util.*;

public class AllNodesDistanceK {
    Map<TreeNode, List<TreeNode>> map = new HashMap<>();


    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        List<Integer> result = new ArrayList<>();
        if (root == null || K < 0) {
            return result;
        }

        buildMap(root, null);

        Queue<TreeNode> q = new LinkedList<>();
        HashSet<TreeNode> visited = new HashSet<>();

        q.add(target);
        visited.add(target);

        while (!q.isEmpty()) {
            int size = q.size();
            if (K == 0) {
                for (int i = 0; i < size; i++) {
                    result.add(q.poll().val);
                }
                return result;
            }

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                for (TreeNode next : map.get(node)) {
                    if (!visited.contains(next)) {
                        visited.add(next);
                        q.add(next);
                    }
                }
            }
            K--;
        }
        return result;
    }

    // Build a graph for finding the distance
    private void buildMap(TreeNode node, TreeNode parent) {
        if (node == null) {
            return;
        } else {
            List<TreeNode> linked = new ArrayList<>();
            if (parent != null) {
                linked.add(parent);
            }
            if (node.left != null) {
                linked.add(node.left);
            }
            if (node.right != null) {
                linked.add(node.right);
            }
            map.put(node, linked);
            buildMap(node.left, node);
            buildMap(node.right, node);
        }
    }
}
