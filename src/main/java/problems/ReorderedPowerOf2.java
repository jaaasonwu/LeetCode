package problems;

public class ReorderedPowerOf2 {
    public boolean reorderedPowerOf2(int N) {
        char[] arr = String.valueOf(N).toCharArray();
        boolean[] visited = new boolean[arr.length];
        StringBuilder sb = new StringBuilder();
        return backtrack(sb, arr, visited);
    }

    public boolean backtrack(StringBuilder sb, char[] arr, boolean[] visited) {
        if (sb.length() == arr.length) {
            return isPower(Integer.valueOf(sb.toString()));
        }

        for (int i = 0; i < arr.length; i++) {
            if (visited[i] || sb.length() == 0 && arr[i] == '0') {
                continue;
            }
            visited[i] = true;
            if (backtrack(sb.append(arr[i]), arr, visited)) {
                return true;
            }
            visited[i] = false;
            sb.deleteCharAt(sb.length() - 1);
        }
        return false;
    }

    public boolean isPower(int n) {
        while (n > 1) {
            if (n % 2 == 1) {
                return false;
            }
            n /= 2;
        }
        return true;
    }
}
