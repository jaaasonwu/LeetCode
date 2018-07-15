package problems;

import org.junit.Test;
import problems.ListNode;
import problems.ReverseKGroup;

/**
 * Created by Jason Wu on 2018/6/27.
 */
public class ReverseKGroupTest {
    @Test
    public void reverseKGroupTest () {
        ListNode head = new ListNode(1);
        ListNode prev = head;
        for (int i = 2; i <= 5; i++) {
            prev.next = new ListNode(i);
            prev = prev.next;
        }

        ReverseKGroup rkg = new ReverseKGroup();
        ListNode result = rkg.reverseKGroup(head, 2);
        ListNode curr = result;
        for (int i = 0; i < 5; i++) {
            System.out.println(curr.val);
            curr = curr.next;
        }
    }
}
