package problems;

import org.junit.Test;

/**
 * Created by Jason Wu on 2018/7/18.
 */
public class RestoreIPAddressTest {
    @Test
    public void restoreIpAddresses() throws Exception {
        String str = "010010";
        RestoreIPAddress ria = new RestoreIPAddress();
        ria.restoreIpAddresses(str);
    }

}