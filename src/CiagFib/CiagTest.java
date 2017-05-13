package CiagFib;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jpokr on 2017-04-13.
 */
public class CiagTest {
    @Test(expected = IllegalArgumentException.class) // informuje, ze test rzuci wyjatkiem
    public void testNullValues() {
        new Ciag().fibonacciSequence(-5);
    }
    @Test
    public void testCiag (){
        int result = new Ciag().fibonacciSequence(4);
        Assert.assertEquals(3,result);
    }


}
