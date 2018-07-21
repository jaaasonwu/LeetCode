package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * Created by Jason Wu on 2018/7/19.
 */
public class SimplifyPath {
    public String simplifyPath(String path) {
        String[] tokens = path.split("/");
        ArrayList<String> strs = new ArrayList<>(Arrays.asList(tokens));
        for (int i = strs.size() - 1; i >= 0; i--) {
            if (strs.get(i).equals("")) {
                strs.remove(i);
            }
        }

        Stack<String> stack = new Stack<>();
        for (int i = 0; i < strs.size(); i++) {
            String curr = strs.get(i);
            if (curr.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (curr.equals(".")) {
                continue;
            } else {
                stack.push(curr);
            }
        }

        if (stack.isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        for (String s : stack) {
            sb.append("/");
            sb.append(s);
        }

        return sb.toString();
    }
}
