package problems;

public class RegularExpressionMatching {

    public boolean match(char[] str, char[] pattern)
    {
        return matchRecursive(str, pattern, 0, 0);
    }

    private boolean matchRecursive(char[] str, char[] pattern, int strPos, int patPos) {
        if (patPos == pattern.length && strPos != str.length) {
            return false;
        }
        if (strPos == str.length && patPos == pattern.length) {
            return true;
        }

        if (patPos + 1 < pattern.length && pattern[patPos + 1] == '*') {
            if (str.length == strPos) {
                return matchRecursive(str, pattern, strPos, patPos + 2);
            }
            if (str[strPos] == pattern[patPos] || pattern[patPos] == '.') {
                return matchRecursive(str, pattern, strPos + 1, patPos + 2)
                        || matchRecursive(str, pattern, strPos + 1, patPos)
                        || matchRecursive(str, pattern, strPos, patPos + 2);
            } else {
                return matchRecursive(str, pattern, strPos, patPos + 2);
            }
        }

        if (str.length == strPos) {
            return false;
        }

        if (pattern[patPos] != '.') {
            if (str[strPos] == pattern[patPos]) {
                return matchRecursive(str, pattern, strPos + 1, patPos + 1);
            }
            return false;
        } else {
            return matchRecursive(str, pattern, strPos + 1, patPos + 1);
        }
    }
}
