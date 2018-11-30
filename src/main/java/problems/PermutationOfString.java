package problems;

import java.util.ArrayList;
import java.util.Collections;

public class PermutationOfString {
    public ArrayList<String> Permutation(String str) {
        char[] arr = str.toCharArray();
        ArrayList<String> res = new ArrayList<>();
        if (str.equals("")) {
            return res;
        }
        permutationRecursive(res, arr, 0);
        Collections.sort(res);
        return res;
    }

    private void permutationRecursive(ArrayList<String> res, char[] arr, int pos) {
        if (pos == arr.length - 1) {
            String str = String.valueOf(arr);
            if (!res.contains(str)) {
                res.add(str);
            }
            return;
        }
        for (int i = pos; i < arr.length; i++) {
            swap(arr, i, pos);
            permutationRecursive(res, arr, pos + 1);
            swap(arr, i, pos);
        }
    }

    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
