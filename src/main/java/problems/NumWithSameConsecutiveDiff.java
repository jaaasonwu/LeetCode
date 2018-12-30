package problems;

import java.util.ArrayList;
import java.util.Stack;

public class NumWithSameConsecutiveDiff {
    public int[] numsSameConsecDiff(int N, int K) {
        int smallestN = 1;
        for (int i = 1; i < N; i++) smallestN *= 10;
        int largestN = 9;
        for (int i = 1; i < N; i++) largestN = largestN * 10 + 9;
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i < 10; i++) {
            stack.add(i);
        }

        ArrayList<Integer> res = new ArrayList<>();
        if (N == 1) res.add(0);

        while (!stack.isEmpty()) {
            int curr = stack.pop();
            if (curr >= smallestN && curr <= largestN) {
                res.add(curr);
            } else if (curr < smallestN) {
                int currDigit = curr % 10;
                if (currDigit + K < 10) {
                    stack.push(curr * 10 + (currDigit + K));
                }

                if (K != 0 && currDigit - K >= 0) {
                    stack.push(curr * 10 + (currDigit - K));
                }
            }
        }

        int[] resArr = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            resArr[i] = res.get(i);
        }

        return resArr;
    }
}
