package problems;

import org.junit.Test;
import problems.TextJustification;

public class TextJustificationTest {

    @Test
    public void fullJustifyTest() {
        TextJustification tj = new TextJustification();
        String[] input = new String[]{"This", "is", "an", "example", "of", "text", "justification."};
        tj.fullJustify(input, 16);
    }
}
