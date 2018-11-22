package problems;

public class LinkedListKthToTail {
    public ListNode FindKthToTail(ListNode head,int k) {
        if (head == null) {
            return null;
        }

        if (k <= 0) {
            return null;
        }

        ListNode first = head;
        ListNode second = head;

        for (int i = 0; i < k - 1; i++) {
            first = first.next;
            if (first == null) {
                return null;
            }
        }

        while (first.next != null) {
            first = first.next;
            second = second.next;
        }

        return second;
    }
}
