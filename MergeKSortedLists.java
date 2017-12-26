/**
 * Created by Jason Wu on 2017/8/31.
 */
public class MergeKSortedLists {
//    private class ListNode {
//        int val;
//        MergeTwoSortedLists.ListNode next;
//        ListNode(int x) { val = x; }
//    }

    public ListNode mergeKLists(ListNode[] lists) {
        return mergePart(lists, 0, lists.length - 1);
    }

    private ListNode mergePart(ListNode[] lists, int start, int end) {
        if (start == end) {
            return lists[start];
        }
        if (start < end) {
            ListNode l1 = mergePart(lists, start, (start + end) / 2);
            ListNode l2 = mergePart(lists, (start + end) / 2 + 1, end);
            return MergeTwoSortedLists.mergeTwoLists(l1, l2);
        } else {
            return null;
        }
    }

}
