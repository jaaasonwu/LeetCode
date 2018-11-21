import problems.*;

public class Main {

    public static void main(String[] args) {
        CheckStringNumeric csn = new CheckStringNumeric();
        System.out.println(csn.isNumeric(new char[]{'1', '2', 'e'}));
    }
}
