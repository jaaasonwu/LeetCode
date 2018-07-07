package problems;

import java.util.ArrayList;

/**
 * Created by Jason Wu on 2018/7/6.
 */
public class ExamRoom {
    int total;
    ArrayList<Integer> list = new ArrayList<>();
    public ExamRoom(int n) {
        total = n;
    }

    public int seat() {
        if (list.size() == 0) {
            list.add(0);
            return 0;
        }
        int minDist = Math.max(list.get(0), total - 1 - list.get(list.size() - 1));
        for (int i = 0; i < list.size() - 1; ++i) {
            minDist = Math.max(minDist, (list.get(i + 1) - list.get(i)) / 2);
        }
        if (list.get(0) == minDist) {
            list.add(0, 0);
            return 0;
        }
        for (int i = 0; i < list.size() - 1; ++i)
            if ((list.get(i + 1) - list.get(i)) / 2 == minDist) {
                list.add(i + 1, (list.get(i + 1) + list.get(i)) / 2);
                return list.get(i + 1);
            }
        list.add(total - 1);
        return total - 1;
    }

    public void leave(int p) {
        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i) == p) list.remove(i);
        }
    }
}
