package problems;

public class ReconstructBinaryTree {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        int len = pre.length;
        if (len == 0) {
            return null;
        }
        int rootVal = pre[0];
        TreeNode root = new TreeNode(rootVal);

        int index = 0;
        for (int i = 0; i < len; i++) {
            if (in[i] == rootVal) {
                index = i;
                break;
            }
        }

        int[] leftPre = new int[index];
        int[] leftIn = new int[index];
        for (int i = 0; i < index; i++) {
            leftPre[i] = pre[i + 1];
            leftIn[i] = in[i];
        }
        root.left = reConstructBinaryTree(leftPre, leftIn);

        int[] rightPre = new int[len - index - 1];
        int[] rightIn = new int[len - index - 1];
        for (int i = index + 1; i < len; i++) {
            rightPre[i - index - 1] = pre[i];
            rightIn[i - index - 1] = in[i];
        }

        root.right = reConstructBinaryTree(rightPre, rightIn);

        return root;
    }
}
