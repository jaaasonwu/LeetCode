package problems;

import org.junit.Test;

public class CommonAncestorForTwoLinkedListTest {

    @Test
    public void findFirstCommonNode2() {
        ListNode common = new ListNode(6);
        common.next = new ListNode(7);
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = common;

        ListNode head2 = new ListNode(4);
        head2.next = new ListNode(5);
        head2.next.next = common;

        CommonAncestorForTwoLinkedList ca = new CommonAncestorForTwoLinkedList();

        ca.FindFirstCommonNode2(head1, head2);
    }
}