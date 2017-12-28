/**
 * Created by jasonwu on 12/28/2017.
 */
public class SwapPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode beforeHead = new ListNode(0);
        beforeHead.next = head;
        ListNode before = beforeHead;
        if (head == null) {
            return head;
        }
        ListNode first = head;
        ListNode second = head.next;

        while (true) {
            if (first != null && second != null) {
                first.next = second.next;
                second.next = first;
                before.next = second;
            } else {
                break;
            }

            before = first;
            if (first.next != null && first.next.next != null) {
                first = first.next;
                second = second.next.next.next;
            } else {
                break;
            }
        }

        return beforeHead.next;
    }
}
