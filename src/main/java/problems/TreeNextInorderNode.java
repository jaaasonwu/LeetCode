package problems;

public class TreeNextInorderNode {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if (pNode == null) {
            return null;
        }

        if (pNode.right != null) {
            return findLeftMost(pNode.right);
        } else {
            return findParent(pNode);
        }
    }

    private TreeLinkNode findLeftMost (TreeLinkNode root) {

        if (root.left == null) {
            return root;
        }

        return findLeftMost(root.left);
    }

    private TreeLinkNode findParent (TreeLinkNode curr) {
        if (curr.next != null && curr.next.left == curr) {
            return curr.next;
        }

        if (curr.next == null) {
            return null;
        }

        return findParent(curr.next);
    }

    public TreeLinkNode GetNext2(TreeLinkNode pNode)
    {
        if (pNode == null) {
            return null;
        }

        if (pNode.right != null) {
            return findLeftMost2(pNode.right);
        } else {
            return findParent2(pNode);
        }
    }

    private TreeLinkNode findLeftMost2 (TreeLinkNode root) {
        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    private TreeLinkNode findParent2 (TreeLinkNode curr) {
        while (curr.next != null) {
            if (curr.next.left == curr) {
                return curr.next;
            }
            curr = curr.next;
        }
        return null;
    }
}
