/**
 * Created by jasonwu on 12/28/2017.
 */
public class StrStr {
    public int strStr (String haystack, String needle) {
        int r = 256;
        int[] right = new int[r];

        for (int c = 0; c < r; c++) {
            right[c] = -1;
        }
        for (int j = 0; j < needle.length(); j++) {
            right[needle.charAt(j)] = j;
        }

        int m = needle.length();
        int n = haystack.length();
        int skip;
        for (int i = 0; i <= n - m; i += skip) {
            skip = 0;
            for (int j = m - 1; j >= 0; j--) {
                if (needle.charAt(j) != haystack.charAt(i + j)) {
                    skip = Math.max(1, j - right[haystack.charAt(i + j)]);
                    break;
                }
            }
            if (skip == 0) {
                return i;
            }

        }
        return -1;
    }
}
