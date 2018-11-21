import problems.*;

public class Main {

    public static void main(String[] args) {
        ReorderOddEven ro = new ReorderOddEven();
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        ro.reOrderArray(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
