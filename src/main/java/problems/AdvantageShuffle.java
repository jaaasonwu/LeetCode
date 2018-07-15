package problems;

import java.util.TreeMap;

/**
 * Created by Jason Wu on 2018/7/15.
 */
public class AdvantageShuffle {
    public int[] advantageCount(int[] A, int[] B) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int[] res = new int[A.length];
        for (int i : A) {
            if (map.containsKey(i)) {
                map.replace(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        for (int i = 0; i < A.length; i++) {
            int x;
            if (map.higherKey(B[i]) != null) {
                x = map.higherKey(B[i]);
            } else {
                x = map.firstKey();
            }

            map.replace(x, map.get(x) - 1);

            if (map.get(x) == 0) {
                map.remove(x);
            }

            res[i] = x;
        }

        return res;
    }


}
