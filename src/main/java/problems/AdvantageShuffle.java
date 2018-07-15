package problems;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Jason Wu on 2018/7/15.
 */
public class AdvantageShuffle {
    public int[] advantageCount(int[] A, int[] B) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        int[] res = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            a.add(A[i]);
            b.add(B[i]);
        }
        a.sort((aEle, bEle) -> aEle > bEle ? 1 : (aEle < bEle ? -1 : 0));

        for (int i = 0; i < A.length; i++) {
            int pos = Collections.binarySearch(a, B[i]);
             if (pos < 0 && -pos - 1 < a.size()) {
                int closest = a.remove(-pos - 1);
                res[i] = closest;
            } else if (pos >= 0 && pos <= a.size() - 2) {
                 int closest = a.get(pos);
                 boolean enter = false;
                 while (pos <= a.size() - 2 && a.get(pos + 1) == closest) {
                     pos++;
                     enter = true;
                 }

                 if (enter && pos == a.size() - 1) {
                     pos--;
                 }

                 closest = a.remove(pos + 1);
                 res[i] = closest;
            } else {
                int smallest = a.remove(0);
                res[i] = smallest;
            }
        }
        return res;
    }


}
