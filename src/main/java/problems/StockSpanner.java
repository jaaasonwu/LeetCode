package problems;

import java.util.ArrayList;

class StockSpanner {

    ArrayList<Integer> arr;
    int[] dp;
    public StockSpanner() {
        arr = new ArrayList<>();
        dp = new int[10000];
        for (int i = 0; i < 9999; i++) {
            dp[i] = 1;
        }
    }

    public int next(int price) {
        arr.add(price);
        int start = arr.size() - 1;
        int count = 1;
        for (int i = start - 1; i >= 0; i--) {
            if (arr.get(i) <= price) {
                count += dp[i];
                i -= dp[i];
                i++;
            }
            else {
                dp[start] = count;
                return count;
            }
        }
        dp[start] = count;
        return count;
    }
}
