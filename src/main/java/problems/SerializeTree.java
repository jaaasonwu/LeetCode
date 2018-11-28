package problems;

public class SerializeTree {
    int pos = 0;
    String Serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();

        serializeRecursive(root, sb);

        return sb.toString();
    }

    public void serializeRecursive(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("$,");
            return;
        }

        sb.append(root.val);
        sb.append(",");
        serializeRecursive(root.left, sb);
        serializeRecursive(root.right, sb);
    }

    TreeNode Deserialize(String str) {
        if (str.length() < 1 || str.charAt(0) == '$') {
            return null;
        }
        TreeNode root = new TreeNode(str.charAt(0));
        deserializeRecursive(str.split(","), root);
        return root;
    }

    TreeNode deserializeRecursive (String[] str, TreeNode curr) {
        if (!str[pos].equals("$")) {
            if (curr != null) {
                curr.val = Integer.valueOf(str[pos]);
            } else {
                curr = new TreeNode(Integer.valueOf(str[pos]));
            }
        } else {
            curr = null;
            return curr;
        }
        pos++;
        if (pos < str.length) {
            curr.left = deserializeRecursive(str, curr.left);
        }
        pos++;
        if (pos < str.length) {
            curr.right = deserializeRecursive(str, curr.right);
        }

        return curr;
    }
}
