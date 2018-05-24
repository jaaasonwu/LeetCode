import org.junit.Test;
import problems.CombinationSum2;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jason Wu on 2018/5/23.
 */
public class CombinationSumTest {

    @Test
    public void combinationSum() {
        CombinationSum2 cs2 = new CombinationSum2();
        System.out.println(cs2.combinationSum2(new int[]{3, 1, 3, 5, 1, 1}, 8));
        assertEquals("[[3, 5], [1, 1, 1, 5], [1, 1, 3, 3]]", cs2.combinationSum2(new int[]{3, 1, 3, 5, 1, 1}, 8).toString());
    }


}
