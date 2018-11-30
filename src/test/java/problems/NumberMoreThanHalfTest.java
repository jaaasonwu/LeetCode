package problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberMoreThanHalfTest {

    @Test
    public void moreThanHalfNum_Solution() {
        NumberMoreThanHalf nm = new NumberMoreThanHalf();
        System.out.println(nm.MoreThanHalfNum_Solution(new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2}));
    }
}