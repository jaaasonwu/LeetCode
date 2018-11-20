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
}
