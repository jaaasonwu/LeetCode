package problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jason Wu on 2018/7/6.
 */
public class KSimilarStrings {

    public int kSimilarity(String A, String B) {
        Map<String, Integer> map = new HashMap<>();
        return backtrack(A.toCharArray(), B, map, 0);
    }

    public int backtrack (char[] a, String b, Map<String, Integer> map, int i) {
        String temp = new String(a);
        if (temp.equals(b)) {
            return 0;
        }
        if (map.containsKey(temp)) {
            return map.get(temp);
        }

        while (i < temp.length() && a[i] == b.charAt(i)) {
            i++;
        }

        int min = Integer.MAX_VALUE;

        for (int j = i + 1; j < a.length; j++) {
            if (a[j] == b.charAt(i)) {
                swap(a, i, j);
                int next = backtrack(a, b, map, i + 1);
                if (next != Integer.MAX_VALUE) {
                    min = Math.min(min, next + 1);
                }
                swap(a, i, j);
            }
        }
        map.put(temp, min);
        return min;
    }

    public void swap(char[] a, int i, int j) {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
