package problems;

/**
 * Created by Jason Wu on 2018/7/19.
 */
public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        if (head == null) {
            return null;
        }

        ListNode insertPos = null;
        ListNode insertNext = head;
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            if (curr.val < x) {
                if (curr.equals(insertNext)) {
                    insertPos = curr;
                    insertNext = curr.next;
                    prev = curr;
                    curr = curr.next;
                } else {
                    ListNode temp = curr.next;
                    if (insertPos != null) {
                        insertPos.next = curr;
                    } else {
                        head = curr;
                    }
                    curr.next = insertNext;
                    insertPos = curr;
                    insertNext = curr.next;
                    curr = temp;
                    prev.next = temp;
                }
            } else {
                prev = curr;
                curr = curr.next;
            }
        }

        return head;
    }

    // Beats 100%
    public ListNode partition2(ListNode head, int x) {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);

        ListNode t1 = l1;
        ListNode t2 = l2;

        ListNode curr = head;

        while (curr != null) {
            if (curr.val < x) {
                t1.next = curr;
                t1 = t1.next;
            } else {
                t2.next = curr;
                t2 = t2.next;
            }
            curr = curr.next;
        }

        t2.next = null;
        t1.next = l2.next;
        return t1.next;
    }
}
