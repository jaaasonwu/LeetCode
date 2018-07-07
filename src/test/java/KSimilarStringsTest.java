import org.junit.Test;
import problems.KSimilarStrings;

/**
 * Created by Jason Wu on 2018/7/6.
 */
public class KSimilarStringsTest {
    @Test
    public void kSimilarityTest() {
        KSimilarStrings kss = new KSimilarStrings();
        int a = kss.kSimilarity("bccaba", "abacbc");
        System.out.println(a);
    }
}
