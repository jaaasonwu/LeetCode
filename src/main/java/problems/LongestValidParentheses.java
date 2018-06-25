package problems;

import java.util.Stack;

/**
 * Created by Jason Wu on 2018/6/25.
 */
public class LongestValidParentheses {
    public int longestValidParentheses (String s) {
        int[] dp = new int[s.length()];
        int result = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    if (i == 1) {
                        dp[i] = 2;
                    } else {
                        dp[i] = dp[i - 2] + 2;
                    }
                } else if (s.charAt(i - 1) == ')' && s.charAt(i - dp[i - 1]  - 1) == '(') {
                    dp[i] = dp[i - 1] + dp[i - dp[i - 1] - 2] + 2;
                }
            }
            result = Math.max(result, dp[i]);
        }
        return result;
    }

    public int longestValidParenthesesStack (String s) {
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    result = i - stack.peek();
                }
            }
        }
        return result;
    }
}
