package problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class EntryOfRingInLinkedListTest {
    @Test
    public void entryOfRingTest() {

        EntryOfRingInLinkedList eor = new EntryOfRingInLinkedList();
        ListNode head = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(4);
        ListNode head5 = new ListNode(5);
        ListNode head6 = new ListNode(6);

        head.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head6;
        head6.next = head3;

        System.out.println(eor.EntryNodeOfLoop(head).val);
    }

}