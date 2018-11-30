package problems;

public class MaxSumOfSubsequence {
    public int FindGreatestSumOfSubArray(int[] array) {
        int len = array.length;
        if (len == 0) {
            return 0;
        }
        int[] dp = new int[len];
        dp[0] = array[0];

        for (int i = 1; i < len; i++) {
            if (dp[i - 1] < 0) {
                dp[i] = array[i];
            } else {
                dp[i] = array[i] + dp[i - 1];
            }
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < len; i++) {
            if (dp[i] > max) {
                max = dp[i];
            }
        }

        return max;
    }
}
