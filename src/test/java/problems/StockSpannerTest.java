package problems;

import org.junit.Test;

public class StockSpannerTest {

    @Test
    public void next() {
        StockSpanner sp = new StockSpanner();
        for (int i = 0; i < 10000; i++) {
            System.out.println(sp.next(i));
        }
    }
}