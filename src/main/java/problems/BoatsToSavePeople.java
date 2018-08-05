package problems;

import java.util.ArrayList;
import java.util.Collections;

public class BoatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        ArrayList<Integer> list = new ArrayList<>();
        int res = 0;

        for (int i : people) {
            list.add(i);
        }

        list.sort((Integer a, Integer b) -> a.compareTo(b));

        for (int i = list.size() - 1; i >= 0; i--) {
            if (i < 1) {
                res++;
                return res;
            }
            int search = Collections.binarySearch(list, limit - list.get(i));

            if (search >= 0 && search <= list.size() - 1) {
                res++;
                list.remove(search);
                list.remove(--i);
            } else if (search >= 0 && search == list.size()) {
                res++;
                list.remove(list.size() - 1);
                list.remove(--i);
            } else if (search == -1) {
                res++;
                list.remove(i);
            } else {
                res++;
                list.remove(-search - 2);
                list.remove(--i);
            }
        }
        return res;
    }
}
