package problems;

import org.junit.Test;

public class ReverseLinkedListTest {

    @Test
    public void reverse() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;

        ReverseLinkedList rll = new ReverseLinkedList();
        ListNode newHead = rll.reverse(node1);

        while (newHead != null) {
            System.out.println(newHead.val);
            newHead = newHead.next;
        }
    }
}