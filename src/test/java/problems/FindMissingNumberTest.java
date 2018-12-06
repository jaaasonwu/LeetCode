package problems;

import org.junit.Test;

public class FindMissingNumberTest {

    @Test
    public void getMissing() {
        FindMissingNumber fm = new FindMissingNumber();
        System.out.println(fm.getMissing(new int[]{0, 2, 3}));
    }
}