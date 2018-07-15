package problems;

import org.junit.Test;
import problems.ShortestSubarrayWithSumAtLeastK;

public class ShortestSubarrayTest {
    @Test
    public void testShortestSubarray () {
        ShortestSubarrayWithSumAtLeastK ss = new ShortestSubarrayWithSumAtLeastK();
        System.out.println(ss.shortestSubarray(new int[]{2, -1, 2}, 3));
    }
}
