package problems;

import java.util.ArrayList;
import java.util.Stack;

public class LinkedListTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        ListNode curr = listNode;

        while (curr != null) {
            stack.push(curr.val);
            curr = curr.next;
        }

        while (!stack.isEmpty()) {
            res.add(stack.pop());
        }

        return res;
    }
}
