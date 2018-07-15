package problems;

import org.junit.Test;
import problems.FourSum;

public class FourSumTest {
    @Test
    public void fourSumTest() {
        FourSum fs = new FourSum();
        int[] input = new int[] {-1,-3,-2,2,3,-3,0,-4};
        System.out.println(fs.fourSum(input, 4));
    }
}
