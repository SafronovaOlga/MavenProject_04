import org.testng.Assert;
import org.testng.annotations.Test;

public class MNumberTest {

    @Test
    public void testMNumberGoodNumber() {

        int m = 15;
        String expectedResult = "Good Number";

        MNumber mNumber = new MNumber();
        String actualResult = mNumber.getMNumbers(m);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
