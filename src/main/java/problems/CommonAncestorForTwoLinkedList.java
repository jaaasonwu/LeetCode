package problems;

import java.util.Stack;

public class CommonAncestorForTwoLinkedList {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) {
            return null;
        }
        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();

        while (pHead1 != null) {
            stack1.push(pHead1);
            pHead1 = pHead1.next;
        }

        while (pHead2 != null) {
            stack2.push(pHead2);
            pHead2 = pHead2.next;
        }

        if (stack1.peek() != stack2.peek()) {
            return null;
        }

        ListNode prev = stack1.peek();
        while (!stack1.isEmpty() && !stack2.isEmpty()) {
            ListNode node1 = stack1.pop();
            if (node1 != stack2.pop()) {
                return prev;
            }
            prev = node1;
        }

        return prev;
    }

    private int getLength(ListNode head) {
        if (head == null) {
            return 0;
        }

        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public ListNode FindFirstCommonNode2(ListNode pHead1, ListNode pHead2) {
        int len1 = getLength(pHead1);
        int len2 = getLength(pHead2);

        if (len1 == 0 || len2 == 0) {
            return null;
        }

        if (pHead1 == pHead2) {
            return pHead1;
        }

        int diff = Math.abs(len1 - len2);

        ListNode longHead = len1 > len2 ? pHead1 : pHead2;
        ListNode shortHead = len1 >= len2 ? pHead2 : pHead1;

        for (int i = 0; i < diff; i++) {
            longHead = longHead.next;
        }

        while (longHead != shortHead && longHead != null) {
            longHead = longHead.next;
            shortHead = shortHead.next;
        }

        return longHead;
    }
}
