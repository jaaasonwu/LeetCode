public class Main {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        RemoveNthFromEnd rm = new RemoveNthFromEnd();
        rm.removeNthFromEnd(head, 1);
        System.out.println(head.val);
    }
}
