package problems;

public class MergeSortedLinkedLists {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode head;
        ListNode curr;
        ListNode head1 = list1;
        ListNode head2 = list2;

        if (head1 == null) {
            return head2;
        }

        if (head2 == null) {
            return head1;
        }

        if (head1.val <= head2.val) {
            head = head1;
            head1 = head1.next;
        } else {
            head = head2;
            head2 = head2.next;
        }
        curr = head;

        while (head1 != null && head2 != null) {
            if (head1.val <= head2.val) {
                curr.next = head1;
                head1 = head1.next;
            } else {
                curr.next = head2;
                head2 = head2.next;
            }
            curr = curr.next;
        }

        if (head1 == null) {
            curr.next = head2;
        } else {
            curr.next = head1;
        }

        return head;
    }
}
