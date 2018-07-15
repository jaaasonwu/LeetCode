package problems;

import org.junit.Before;
import org.junit.Test;
import problems.MultiplyStrings;

public class MultiplyStringsTest {
    MultiplyStrings ms;

    @Before
    public void init() {
        ms = new MultiplyStrings();
    }

    @Test
    public void multiplyStrings2Test() {
//        assert (ms.multiply2("2", "3").equals("6"));
//        assert (ms.multiply2("123", "456").equals("56088"));
        assert (ms.multiply2("1111", "1000").equals("1111000"));
        System.out.println(ms.multiply2("99999999999999999999999999999999", "99999999999999999999999999999999"));
    }

    @Test
    public void multiplyStringsTest() {
//        assert (ms.multiply("2", "3").equals("6"));
//        assert (ms.multiply("123", "456").equals("56088"));
        assert (ms.multiply("1111", "1000").equals("1111000"));
    }

    @Test
    public void multiplyOneDigitTest() {
        assert (ms.multiplyOneDigitInverted("89", 9).equals("108"));
        assert (ms.multiplyOneDigitInverted("90", 9).equals("018"));
    }

    @Test
    public void addZerosTest() {
        assert (ms.addZeros("111", 3).equals("000111"));
        assert (ms.addZeros("001", 3).equals("000001"));
    }

    @Test
    public void addTwoTest() {
        assert (ms.addTwo("111", "0").equals("111"));
        assert (ms.addTwo("001", "1").equals("101"));
        assert (ms.addTwo("99", "99").equals("891"));
    }
}
