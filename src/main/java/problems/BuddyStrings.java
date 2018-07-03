package problems;

import java.util.HashSet;

public class BuddyStrings {
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length() || A.length() < 2) {
            return false;
        }

        char[] a = A.toCharArray();
        char[] b = B.toCharArray();
        char diffA = '\0';
        char diffB = '\0';
        int countDiff = 0;
        boolean res = false;

        if (A.equals(B)) {
            HashSet<Character> charSet = new HashSet<>();
            for (char c : a) {
                if (charSet.contains(c)) {
                    return true;
                } else {
                    charSet.add(c);
                }
            }

            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                if (countDiff == 0) {
                    diffA = a[i];
                    diffB = b[i];
                    countDiff++;
                } else if (countDiff == 1) {
                    if (a[i] == diffB && b[i] == diffA) {
                        res = true;
                        countDiff++;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }

        if (res) {
            return true;
        } else {
            return false;
        }
    }
}
