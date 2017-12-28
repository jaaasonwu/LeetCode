public class Main {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
//        ListNode sec = new ListNode(2);
//        head.next = sec;
        SwapPairs swapPairs = new SwapPairs();
        swapPairs.swapPairs(head);
        System.out.println(head.val);
    }
}
