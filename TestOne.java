import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestOne {
    private int[] in;
    private int[] out;

    public TestOne(int[] in, int[] out) {
        this.in = in;
        this.out = out;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> inOut() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 6, 4, 3, 2}, new int[]{3, 2}},
                {new int[]{8, 7, 4, 5, 2}, new int[]{5, 2}},
                {new int[]{5, 5, 4, 1, 1, 1}, new int[]{1, 1, 1}},
                {new int[]{0, 5, 4, 0, 2, 0}, new int[]{0, 2, 0}}
        });
    }

    @Test
    public void afterFour() {
        Assert.assertArrayEquals(out, MyClass.afterFour(in));
        System.out.println();
    }
}
