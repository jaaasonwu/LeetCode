import problems.CombinationSum2;
import problems.DuplicateInArray;

public class Main {

    public static void main(String[] args) {
        DuplicateInArray dia = new DuplicateInArray();
        int[] duplicate = new int[1];
        System.out.println(dia.duplicate2(new int[]{2, 4, 3, 1, 4}, 5, duplicate));
        System.out.println(duplicate[0]);
    }
}
