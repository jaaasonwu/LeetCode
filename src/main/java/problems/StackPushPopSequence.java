package problems;

import java.util.Stack;

public class StackPushPopSequence {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<>();
        int pushCount = 0;

        for (int i : popA) {
            if (!stack.isEmpty()) {
                if (stack.peek() == i) {
                    stack.pop();
                    continue;
                }
            }

            while (pushCount < pushA.length && pushA[pushCount] != i) {
                stack.push(pushA[pushCount]);
                pushCount++;
            }

            if (pushCount == pushA.length) {
                return false;
            }

            if (pushA[pushCount] == i) {
                pushCount++;
            }
        }
        return true;
    }
}
