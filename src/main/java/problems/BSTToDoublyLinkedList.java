package problems;

public class BSTToDoublyLinkedList {
    public TreeNode Convert2(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return null;
        }
        return convertSubtree2(pRootOfTree).head;
    }

    private DoublyLinkedList convertSubtree2(TreeNode root) {
        DoublyLinkedList linkedList = new DoublyLinkedList();

        if (root.left == null && root.right == null) {
            linkedList.head = root;
            linkedList.tail = root;
            return linkedList;
        }

        if (root.left == null) {
            linkedList.head = root;
        } else if (root.right == null) {
            linkedList.tail = root;
        }

        DoublyLinkedList left = null;
        DoublyLinkedList right = null;

        if (linkedList.head == null) {
            left = convertSubtree2(root.left);
            linkedList.head = left.head;
        }
        if (linkedList.tail == null) {
            right = convertSubtree2(root.right);
            linkedList.tail = right.tail;
        }

        if (left != null) {
            root.left = left.tail;
            left.tail.right = root;
        }

        if (right != null) {
            root.right = right.head;
            right.head.left = root;
        }

        return linkedList;
    }

    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return null;
        }

        TreeNode res = convertSubtree(pRootOfTree, null);
        while (res != null && res.left != null) {
            res = res.left;
        }
        return res;
    }

    private TreeNode convertSubtree(TreeNode root, TreeNode last) {
        if (root == null) {
            return null;
        }

        TreeNode curr = root;

        if (curr.left != null) {
            last = convertSubtree(curr.left, last);
        }

        curr.left = last;
        if (last != null) {
            last.right = curr;
        }

        last = curr;
        if (curr.right != null) {
            last = convertSubtree(curr.right, last);
        }

        return last;
    }

}

class DoublyLinkedList {
    TreeNode head = null;
    TreeNode tail = null;
}
