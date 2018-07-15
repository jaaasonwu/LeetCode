package problems;

import java.util.ArrayList;

public class BinaryGap {
    public int binaryGap(int N) {
        ArrayList<Integer> arr = new ArrayList<>();
        int count = 0;
        int res = 0;
        int prev = -1;

        while (N > 0) {
            int remain = N % 2;
            if (remain == 0) {
                arr.add(0, remain);
            } else {
                arr.add(0, 1);
            }
            N /= 2;
        }

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 1) {
                if (prev != -1) {
                    count = i - prev;
                    res = Math.max(count, res);
                }
                prev = i;
            }
        }

        return res;
    }
}
