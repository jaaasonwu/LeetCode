package problems;

import java.util.HashMap;

/**
 * Created by Jason Wu on 2017/8/30.
 */
public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char string[];
        int left = 0, max = 0;
        string = s.toCharArray();

        if (string.length == 0) {
            return 0;
        }

        for (int i = 0; i < string.length; i++) {
            if (map.containsKey(string[i])) {
                left = Math.max(left, map.get(string[i]) + 1);
            }

            map.put(string[i], i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}
