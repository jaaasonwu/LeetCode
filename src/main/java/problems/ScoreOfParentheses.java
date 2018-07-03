package problems;

import java.util.Stack;

public class ScoreOfParentheses {
    public int scoreOfParentheses(String S) {
        char[] str = S.toCharArray();
        return score(str, 0, str.length - 1);
    }

    public int score(char[] str, int start, int end) {
        if (start == end - 1) {
            return 1;
        }
        Stack<Character> stack = new Stack<>();
        stack.push('(');
        for (int i = start + 1; i <= end; i++) {
            if (str[i] == '(') {
                stack.push('(');
            } else {
                stack.pop();
            }

            if (stack.isEmpty()) {
                if (i == end) {
                    return 2 * score(str, start + 1, end - 1);
                } else {
                    return score(str, start, i) + score(str, i + 1, end);
                }
            }
        }
        return 0;
    }
}
