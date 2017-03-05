import java.util.Stack;

/**
 * Created by jasonwu on 2017/3/5.
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> opposite = new Stack<>();
        char[] charArray = s.toCharArray();

        for (char c : charArray) {
            if (c == '(') {
                opposite.push(')');
            } else if (c == '[') {
                opposite.push(']');
            } else if (c == '{') {
                opposite.push('}');
            } else if (opposite.isEmpty() || c != opposite.pop()){
                return false;
            }
        }
        return opposite.isEmpty();
    }
}
