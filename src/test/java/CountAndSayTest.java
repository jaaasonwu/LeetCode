import org.junit.Test;
import problems.CountAndSay;

public class CountAndSayTest {
    @Test
    public void countAndSayTest () {
        CountAndSay cas = new CountAndSay();
        System.out.println(cas.countAndSay(21));
        assert (cas.countAndSay(4).equals("1211"));
        assert (cas.countAndSay(5).equals("111221"));
    }
}
