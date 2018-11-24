package problems;

import java.util.Stack;

public class StackWithMin {
    private Stack<Integer> data = new Stack<>();
    private Stack<Integer> help = new Stack<>();

    public void push(int node) {
        data.push(node);
        if (help.isEmpty()) {
            help.push(node);
        }

        help.push(Math.min(help.peek(), node));
    }

    public void pop() {
        if (!help.isEmpty()) {
            help.pop();
            data.pop();
        }

    }

    public int top() {
        return data.peek();
    }

    public int min() {
        return help.peek();
    }
}
