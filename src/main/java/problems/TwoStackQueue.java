package problems;

import java.util.Stack;

public class TwoStackQueue {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                return -1;
            }

            while (!stack1.isEmpty()) {
                int curr = stack1.pop();
                stack2.push(curr);
            }
        }

        return stack2.pop();
    }
}
