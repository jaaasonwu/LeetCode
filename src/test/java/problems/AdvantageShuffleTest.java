package problems;

import org.junit.Test;

/**
 * Created by Jason Wu on 2018/7/15.
 */
public class AdvantageShuffleTest {
    AdvantageShuffle as;
    @Test
    public void advantageCount() throws Exception {
        as = new AdvantageShuffle();
        as.advantageCount(new int[]{2, 0, 4, 1, 2}, new int[]{1, 3, 0, 0, 2});
    }

}