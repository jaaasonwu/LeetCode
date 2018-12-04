package problems;

public class LongestSubstringWithNoRepetition {
    public int longestSubstring(String str) {
        if (str.equals("")) {
            return 0;
        }
        int[] alpha = new int[26];
        for (int i = 0; i < 26; i++) {
            alpha[i] = -1;
        }
        int max = 0;
        int curr = 0;

        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int distToLast = i - alpha[arr[i] - 'a'];
            if (distToLast > curr) {
                curr++;
            } else {
                curr = distToLast;
            }
            if (curr > max) {
                max = curr;
            }
            alpha[arr[i] - 'a'] = i;
        }
        return max;
    }
}
