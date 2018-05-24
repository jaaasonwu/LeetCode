package problems;

/**
 * Created by jasonwu on 12/26/2017.
 */
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode beforeHead = new ListNode(0);
        beforeHead.next = head;
        ListNode curr = beforeHead;
        ListNode target = beforeHead;
        for (int i = n; i >= 0; i--) {
            curr = curr.next;
        }
        while (curr != null) {
            curr = curr.next;
            target = target.next;
        }

        target.next = target.next.next;

        return beforeHead.next;
    }
}
