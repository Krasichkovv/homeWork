package lesson6;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)

public class ArrAfterFourTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                { new int[] {1, 1, 1, 4, 2}, new int[] {2} },
                { new int[] {4, 4, 4, 1, 3, 6}, new int[] {1, 3, 6} },
                { new int[] {1, 1, 1, 1, 4, 4, 4}, new int[0] },
                { new int[] {2, 1, 4, 1, 9, 5}, new int[] {1, 9, 5} }
        });
    }

    private int[] in;
    private int[] out;

    public ArrAfterFourTest (int[] in, int[] out) {
        this.in = in;
        this.out = out;
    }

    @Test
    public void test() {
        Assert.assertArrayEquals(out, Main.arrAfterFour(in));
    }
}
