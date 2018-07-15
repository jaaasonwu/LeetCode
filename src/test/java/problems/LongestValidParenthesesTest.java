package problems;

import org.junit.Before;
import org.junit.Test;
import problems.LongestValidParentheses;

/**
 * Created by Jason Wu on 2018/6/25.
 */
public class LongestValidParenthesesTest {
    LongestValidParentheses lvp;
    @Before
    public void before() {
        lvp = new LongestValidParentheses();
    }
    @Test
    public void testLongestParentheses() {
        assert(lvp.longestValidParentheses("()()") == 4);
        assert (lvp.longestValidParentheses("(((()))") == 6);
        assert (lvp.longestValidParentheses("())") == 2);
    }

    @Test
    public void testLongestParenthesesStack () {
        assert (lvp.longestValidParenthesesStack("(((())") == 4);
    }
}
