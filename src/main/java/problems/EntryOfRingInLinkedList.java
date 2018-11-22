package problems;

public class EntryOfRingInLinkedList {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ListNode meet = findNode(pHead);
        if (meet == null) {
            return null;
        }

        int ringSize = countNode(meet);
        return findEntry(pHead, ringSize);
    }

    private ListNode findNode (ListNode pHead) {
        if (pHead == null) {
            return null;
        }

        ListNode slow = pHead;
        ListNode fast = pHead;

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
            if (fast == null) {
                return null;
            }
            fast = fast.next;
            if (fast == slow) {
                return fast;
            }
        }

        return null;
    }

    private int countNode(ListNode meet) {
        int count = 1;

        ListNode stop = meet;
        ListNode move = meet.next;
        while (move != stop) {
            count++;
            move = move.next;
        }
        return count;
    }

    private ListNode findEntry(ListNode pHead, int count) {
        ListNode slow = pHead;
        ListNode fast = pHead;
        while (count > 0) {
            fast = fast.next;
            count--;
        }

        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }

        return fast;
    }
}
