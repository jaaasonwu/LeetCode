package problems;

/**
 * Created by Jason Wu on 2018/2/28.
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        int shortest = Integer.MAX_VALUE;

        if (strs.length == 0) {
            return "";
        }

        for (String s : strs) {
            if (s.length() < shortest) {
                shortest = s.length();
            }
        }

        for (int i = 0; i < shortest; i++) {
            char c = strs[0].charAt(i);
            for (String s : strs) {
                if (s.charAt(i) != c) {
                    return result.toString();
                }
            }
            result.append(c);
        }
        return result.toString();
    }
}
