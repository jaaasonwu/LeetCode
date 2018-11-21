import problems.*;

public class Main {

    public static void main(String[] args) {
        RegularExpressionMatching rem = new RegularExpressionMatching();
        System.out.println(rem.match(new char[]{'b', 'b', 'b', 'b', 'a'}, new char[]{'.', '*', 'a', '*', 'a'}));
    }
}
