package TestZadania;

import CiagFib.Ciag;
import Zadania.MyNumber;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by jpokr on 2017-04-12.
 */
public class MyNumberTest {

    public MyNumber n;

    @Before
    public void initValue() {
        n = new MyNumber(5);
    }

    @Test
    public void testIsOdd() {

        Assert.assertTrue(n.isOdd());
        n = new MyNumber(6);
        Assert.assertFalse(n.isOdd());
        ///Assert.assertEquals(n.isOdd(),false);   to samo co powyzej, ale brzydziej
    }

    @Test
    public void testPow() {
        Assert.assertEquals(n.pow(n), 3125);
    }

    @Test
    public void testSqrt() {
        MyNumber sqrtTestNumber = new MyNumber(9);
        Assert.assertEquals(3, sqrtTestNumber.sqrt(), 0);
    }
}