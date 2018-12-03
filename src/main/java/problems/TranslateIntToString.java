package problems;

import java.util.ArrayList;

public class TranslateIntToString {
    public int translate(int num) {
        if (num < 0) {
            return 0;
        }
        String numStr = String.valueOf(num);
        int len = numStr.length();
        int[] dp = new int[len];
        int pos = len - 1;
        dp[pos] = 1;
        pos--;

        int temp;
        while (pos >= 0) {
            temp = dp[pos + 1];
            int twoDigits = (numStr.charAt(pos) - '0') * 10 + (numStr.charAt(pos + 1) - '0');
            if (twoDigits >= 10 && twoDigits < 26) {
                if (pos + 2 < len) temp += dp[pos + 2];
                else temp += 1;
            }

            dp[pos] = temp;
            pos--;
        }

        return dp[0];
    }
}
