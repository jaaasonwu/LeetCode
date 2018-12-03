package problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class DigitInNumberSequenceTest {

    @Test
    public void digitInSequence() {
        DigitInNumberSequence di = new DigitInNumberSequence();
        assert di.digitInSequence(10) == 1;
        assert di.digitInSequence(8) == 8;
        assert di.digitInSequence(11) == 0;
        assert di.digitInSequence(12) == 1;
        assert di.digitInSequence(19) == 4;
        assert di.digitInSequence(190) == 1;
        assert di.digitInSequence(189) == 9;
    }
}