import problems.*;

public class Main {

    public static void main(String[] args) {
        PathInMatrix pim = new PathInMatrix();
        System.out.println(pim.hasPath(new char[]{'a', 'b', 't', 'g', 'c', 'f', 'c', 's', 'j', 'd', 'e', 'h'},
                3, 4, new char[]{'b', 'f', 'c', 'e'}));
    }
}
