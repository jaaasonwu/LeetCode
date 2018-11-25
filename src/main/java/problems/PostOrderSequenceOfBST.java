package problems;

public class PostOrderSequenceOfBST {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence.length == 0) {
            return false;
        }

        if (sequence.length == 1) {
            return true;
        }

        return verifyRecursive(sequence, 0, sequence.length - 1);
    }

    private boolean verifyRecursive(int[] sequence, int start, int end) {
        if (start == end) {
            return true;
        }

        int root = sequence[end];

        int startOfRight;
        for (startOfRight = start; startOfRight <= end - 1; startOfRight++) {
            if (sequence[startOfRight] > root) {
                break;
            }
        }

        for (int i = startOfRight; i <= end - 1; i++) {
            if (sequence[i] < root) {
                return false;
            }
        }

        boolean left = true, right = true;
        if (startOfRight - 1 >= start) {
            left = verifyRecursive(sequence, start, startOfRight - 1);
        }

        if (startOfRight <= end - 1) {
            right = verifyRecursive(sequence, startOfRight, end - 1);
        }
        return left && right;
    }
}
