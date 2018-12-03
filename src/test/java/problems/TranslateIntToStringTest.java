package problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class TranslateIntToStringTest {

    @Test
    public void translate() {
        TranslateIntToString ti = new TranslateIntToString();
        assert ti.translate(258) == 2;
        assert ti.translate(123) == 3;
        assert ti.translate(0) == 1;
        assert ti.translate(268) == 1;
    }
}