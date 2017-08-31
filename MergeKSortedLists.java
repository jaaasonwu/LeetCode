/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

/**
 * Created by Jason Wu on 2017/8/31.
 */
public class MergeKSortedLists {
//    private class ListNode {
//        int val;
//        MergeTwoSortedLists.ListNode next;
//        ListNode(int x) { val = x; }
//    }

    public MergeTwoSortedLists.ListNode mergeKLists(MergeTwoSortedLists.ListNode[] lists) {
        return mergePart(lists, 0, lists.length - 1);
    }

    private MergeTwoSortedLists.ListNode mergePart(MergeTwoSortedLists.ListNode[] lists, int start, int end) {
        if (start == end) {
            return lists[start];
        }
        if (start < end) {
            MergeTwoSortedLists.ListNode l1 = mergePart(lists, start, (start + end) / 2);
            MergeTwoSortedLists.ListNode l2 = mergePart(lists, (start + end) / 2 + 1, end);
            return MergeTwoSortedLists.mergeTwoLists(l1, l2);
        } else {
            return null;
        }
    }

}
