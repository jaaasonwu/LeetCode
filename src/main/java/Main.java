import problems.*;

public class Main {

    public static void main(String[] args) {
        TreeNextInorderNode tn = new TreeNextInorderNode();
        TreeLinkNode root = new TreeLinkNode(1);
        TreeLinkNode node2 = new TreeLinkNode(2);
        root.right = node2;
        node2.next = root;
        TreeLinkNode node3 = new TreeLinkNode(3);
        node2.right = node3;
        node3.next = node2;
        System.out.println(tn.GetNext(node3));
    }
}
