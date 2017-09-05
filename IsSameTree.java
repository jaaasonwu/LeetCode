/**
 * Created by Jason Wu on 2017/9/5.
 */
public class IsSameTree {
    public boolean isSameTree(InorderTraversal.TreeNode p, InorderTraversal.TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        }
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

}
