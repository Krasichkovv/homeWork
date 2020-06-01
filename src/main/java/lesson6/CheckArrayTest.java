package lesson6;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)

public class CheckArrayTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                { new int[] {1, 1, 1}, false },
                { new int[] {4, 4, 4, 1}, true },
                { new int[] {1, 1, 1, 1, 4, 4, 4}, true},
                { new int[] {2, 1, 4, 1, 3}, false}
        });
    }

    private int[] arr;
    private boolean result;

    public CheckArrayTest (int[] arr, boolean result) {
        this.arr = arr;
        this.result = result;
    }

    @Test
    public void test() {
        Assert.assertEquals(result, Main.checkArray(arr));
    }
}
