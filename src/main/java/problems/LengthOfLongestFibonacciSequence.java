package problems;

import java.util.HashSet;

public class LengthOfLongestFibonacciSequence {
    public int lenLongestFibSubseq(int[] A) {
        if (A.length < 3) {
            return 0;
        }
        HashSet<Integer> hs = new HashSet();
        int max = 2;
        int maxNum = A[A.length - 1];
        int count;
        for (Integer i : A) {
            hs.add(i);
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                int prev = A[i];
                int curr = A[j];
                count = 0;
                while (hs.contains(prev + curr)) {
                    if (prev + curr > maxNum) {
                        break;
                    }
                    int temp = curr;
                    curr = prev + curr;
                    prev = temp;
                    count++;
                }
                max = Math.max(max, count + 2);
            }
        }

        if (max == 2) {
            return 0;
        }
        return max;
    }
}
