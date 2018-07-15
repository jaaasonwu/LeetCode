package problems;

import org.junit.Test;
import problems.ExamRoom;

/**
 * Created by Jason Wu on 2018/7/6.
 */
public class ExamRoomTest {
    @Test
    public void examRoomTest() {
        ExamRoom er = new ExamRoom(4);
        er.seat();
        er.seat();
        er.seat();
        er.seat();
        er.leave(1);
        er.leave(3);
        er.seat();
    }
}
