package problems;

import org.junit.Test;

public class CutRopeTest {
    @Test
    public void maxProductAfterCutting() {
        CutRope cr = new CutRope();
        assert cr.maxProductAfterCutting(8) == 18;
        assert cr.maxProductAfterCutting(0) == 0;
    }
}
