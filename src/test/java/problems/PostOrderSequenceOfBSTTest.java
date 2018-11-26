package problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class PostOrderSequenceOfBSTTest {

    @Test
    public void verifySquenceOfBST() {
        PostOrderSequenceOfBST po = new PostOrderSequenceOfBST();
        System.out.println(po.VerifySquenceOfBST(new int[]{5, 7, 6, 9, 11, 10, 8}));
    }
}