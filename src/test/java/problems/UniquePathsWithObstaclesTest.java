package problems;

import org.junit.Test;
import problems.UniquePathsWithObstacles;

/**
 * Created by Jason Wu on 2018/6/25.
 */
public class UniquePathsWithObstaclesTest {
    @Test
    public void uniquePathsWithObstaclesTest() {
        UniquePathsWithObstacles upwo = new UniquePathsWithObstacles();
        int[][] input = new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        System.out.println(upwo.uniquePathWithObstacles(input));
        assert (upwo.uniquePathWithObstacles(input) == 2);
    }
}
