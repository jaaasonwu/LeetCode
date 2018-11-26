package problems;

public class CloneOfComplexLinkedList {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if (pHead == null) {
            return null;
        }

        appendCopy(pHead);
        linkNewNodes(pHead);
        return split(pHead);
    }

    private void appendCopy(RandomListNode head) {
        RandomListNode curr = head;
        while (curr != null) {
            RandomListNode newNode = new RandomListNode(curr.label);
            if (curr.next != null) {
                newNode.next = curr.next;
            }
            curr.next = newNode;
            curr = newNode.next;
        }
    }

    private void linkNewNodes(RandomListNode head) {
        RandomListNode curr = head;

        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }
    }

    private RandomListNode split(RandomListNode head) {
        RandomListNode head2 = head.next;
        RandomListNode curr1 = head;
        RandomListNode curr2 = head2;

        while (curr2 != null) {
            curr1.next = curr1.next.next;
            curr2.next = curr2.next.next;

            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        return head2;
    }
}

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
