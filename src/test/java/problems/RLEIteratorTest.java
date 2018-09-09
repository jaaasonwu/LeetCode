package problems;

import org.junit.Test;

public class RLEIteratorTest {

    @Test
    public void next() {
        int[] A = {811,903,310,730,899,684,472,100,434,611};
        RLEIterator rle = new RLEIterator(A);
        System.out.println(rle.next(358));
        System.out.println(rle.next(345));
        System.out.println(rle.next(154));
        System.out.println(rle.next(265));
        System.out.println(rle.next(73));
        System.out.println(rle.next(220));
        System.out.println(rle.next(138));
        System.out.println(rle.next(4));
        System.out.println(rle.next(170));
        System.out.println(rle.next(88));
    }
}