package problems;

public class MaxValueOfGift {
    public int maxValue(int[][] values) {
        int numRows = values.length;
        int numCols = values[0].length;
        int[] dp = new int[numCols];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                int left = j > 0 ? dp[j - 1] : 0;
                int up = i > 0 ? dp[j] : 0;
                dp[j] = values[i][j] + Math.max(left, up);
            }
        }

        return dp[numCols - 1];
    }
}
