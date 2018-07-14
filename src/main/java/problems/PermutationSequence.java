package problems;

import java.util.ArrayList;

public class PermutationSequence {
    StringBuilder sb;
    ArrayList<Integer> remain;
    int[] factorials;

    public String getPermutation(int n, int k) {
        sb = new StringBuilder();
        remain = new ArrayList<>();
        factorials = new int[n];
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            remain.add(i);
            fac *= i;
            factorials[i - 1] = fac;
        }
        calcPermutation(n, k);
        return sb.toString();
    }
    public void calcPermutation(int n, int k) {
        if (n == 1) {
            sb.append(remain.get(0));
            return;
        }

        int next = (k - 1) / factorials[n - 2];
        sb.append(remain.get(next));
        remain.remove(new Integer(remain.get(next)));
        calcPermutation(n - 1, (k - 1) % factorials[n - 2] + 1);
    }
