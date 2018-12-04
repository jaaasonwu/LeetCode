package problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringWithNoRepetitionTest {

    @Test
    public void longestSubstring() {
        LongestSubstringWithNoRepetition ls = new LongestSubstringWithNoRepetition();
        assert ls.longestSubstring("arabcacfr") == 4;
    }
}