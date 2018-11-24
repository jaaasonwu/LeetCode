package problems;

import java.util.Stack;

public class BasicCalculator {
    public int calculate(String s) {
        String newStr = s.replaceAll("\\s+","");
        return calcSub(newStr, 0);
    }

    private int calcSub(String s, int res) {
        if (s.length() == 0) {
            return res;
        }

        if (s.charAt(0) == '-') {
            int end = getNextElement(s.substring(1));
            return res - calcSub(s.substring(1, end + 1), res) +
                    (end + 1 >= s.length() ? 0 : calcSub(s.substring(end + 1), res));
        } else if (s.charAt(0) == '+'){
            return res + calcSub(s.substring(1), res);
        }

        int end = getNextElement(s);
        if (s.charAt(0) == '(') {
            return res + calcSub(s.substring(1, end - 1), res) +
                    (end + 2 > s.length() ? 0 : calcSub(s.substring(end), res));
        } else {
            int nextInt = Integer.valueOf(s.substring(0, end));
            return res + nextInt + calcSub(s.substring(end), res);
        }

    }

    private int getNextElement(String s) {
        if (s.charAt(0) == '+' || s.charAt(0) == '-') {
            return 1;
        }
        if (s.charAt(0) == '(') {
            Stack<Integer> stack = new Stack<>();
            int i;
            for (i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    stack.push(1);
                } else if (s.charAt(i) == ')') {
                    stack.pop();
                    if (stack.isEmpty()) {
                        break;
                    }
                }
            }
            return i + 1;
        }

        int i = 0;
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            i++;
        }
        return i;
    }
}
