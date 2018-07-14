package problems;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode currTail = null;
        ListNode currHead = head;
        int len = 0;

        if (currHead == null) {
            return null;
        }

        if (currHead.next == null) {
            return currHead;
        }
        while (currHead != null) {
            if (currHead.next == null) {
                currTail = currHead;
            }
            currHead = currHead.next;
            len++;
        }

        int rot = k % len;
        currHead = head;
        for (int i = 0; i < len - rot; i++) {
            ListNode temp = currHead.next;
            currTail.next = currHead;
            currHead.next = null;
            currTail = currHead;
            currHead =  temp;
        }
        return currHead;
    }
}
