package problems;

/**
 * Created by Jason Wu on 2018/6/25.
 */
public class UniquePathsWithObstacles {
    public int uniquePathWithObstacles(int[][] obstacleGrid) {
        int dp[][] = new int[obstacleGrid.length][obstacleGrid[0].length];
        if (obstacleGrid[0][0] != 1) {
            dp[0][0] = 1;
        }
        for (int i = 0; i < obstacleGrid.length; i++) {
            for (int j = 0; j < obstacleGrid[0].length; j++) {
                if ((i != 0 || j != 0) && obstacleGrid[i][j] != 1) {
                    dp[i][j] = (i >= 1 ? dp[i - 1][j] : 0) + (j >= 1 ? dp[i][j - 1] : 0);
                }
            }
        }
        return dp[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }
}
