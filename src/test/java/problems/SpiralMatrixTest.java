package problems;

import org.junit.Test;
import problems.SpiralMatrix;

public class SpiralMatrixTest {
    @Test
    public void spiralMatrixTest () {
        SpiralMatrix sm = new SpiralMatrix();
        System.out.println(sm.spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}}));
    }
}
