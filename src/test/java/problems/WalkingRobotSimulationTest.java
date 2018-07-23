package problems;

import org.junit.Test;

public class WalkingRobotSimulationTest {
    @Test
    public void robotSim () {
        WalkingRobotSimulation p2 = new WalkingRobotSimulation();
        p2.robotSim(new int[]{4, -1, 4, -2, 4}, new int[][]{{2, 4}});
    }

}