package problems;

public class DeleteDuplicatesInLinkedList {
    public ListNode deleteDuplication(ListNode pHead)
    {
        if (pHead == null) {
            return null;
        }

        ListNode curr = pHead;
        ListNode prev = null;

        while (curr != null) {
            ListNode next = curr.next;
            if (next == null) {
                break;
            }
            boolean deleted = false;
            while (next.val == curr.val) {
                next = next.next;
                deleted = true;
                if (next == null) {
                    break;
                }
            }

            if (!deleted) {
                prev = curr;
            } else {
                if (prev == null) {
                    pHead = next;
                } else {
                    prev.next = next;
                }
            }
            curr = next;
        }

        return pHead;
    }
}
