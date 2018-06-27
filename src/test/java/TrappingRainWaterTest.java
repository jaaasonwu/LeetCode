import org.junit.Test;
import problems.TrappingRainWater;

public class TrappingRainWaterTest {
    @Test
    public void trapTest() {
        TrappingRainWater trw = new TrappingRainWater();
        assert (trw.trap(new int[]{2, 0, 2}) == 2);
    }
}
