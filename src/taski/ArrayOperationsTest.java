package taski;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jpokr on 2017-05-17.
 */
public class ArrayOperationsTest {

    @Test
    public void TestReverseArray() {
        int[] array = {1, 2, 3, 4};
        int[] expectedArray = {4, 3, 2, 1};

        Assert.assertArrayEquals(expectedArray, ArrayOperations.reverseArray(array));
    }
}

