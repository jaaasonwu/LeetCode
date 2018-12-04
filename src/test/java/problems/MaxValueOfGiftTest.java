package problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxValueOfGiftTest {

    @Test
    public void maxValue() {
        MaxValueOfGift mv = new MaxValueOfGift();
        int[][] values = new int[][]{{1, 10, 3, 8}, {12,2,9,6},{5,7,4,11},{3,7,16,5}};
        assert mv.maxValue(values) == 53;
        int[][] values2 = new int[][]{{1}};
        assert mv.maxValue(values2) == 1;
    }
}