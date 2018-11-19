package problems;

public class SearchIn2dArray {
    public boolean Find(int target, int [][] array) {
        int width = array[0].length;
        int height = array.length;
        int i = 0;
        int j = width - 1;
        while (i < height && j >= 0) {
            int curr = array[i][j];
            if (target < curr) j--;
            else if (target > curr) i++;
            else return true;
        }
        return false;
    }
}
