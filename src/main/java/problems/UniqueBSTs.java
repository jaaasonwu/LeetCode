package problems;

import java.util.HashMap;

/**
 * Created by Jason Wu on 2018/7/18.
 */
public class UniqueBSTs {
    HashMap<Integer, Integer> subtree = new HashMap<>();
    public int numTrees(int n) {
        return numSubtree(1, n);
    }

    private int numSubtree(int start, int end) {
        int res = 0;
        if (start == end) {
            return 1;
        }

        if (start > end) {
            return 0;
        }

        if (subtree.containsKey(end - start)) {
            return subtree.get(end - start);
        }

        for (int i = start; i <= end; i++) {
            int left = numSubtree(start, i - 1);
            int right =  numSubtree(i + 1, end);
            if (left == 0) {
                res += right;
            } else if (right == 0) {
                res += left;
            } else {
                res += left * right;
            }
        }
        subtree.put(end - start, res);

        return res;
    }
}
