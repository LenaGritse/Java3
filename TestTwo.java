import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestTwo {
    private int[] in;
    private boolean out;

    public TestTwo(int[] in, boolean out) {
        this.in = in;
        this.out = out;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> inOut() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 1, 4, 1}, true},
                {new int[]{3, 5, 3, 8}, false},
                {new int[]{4, 0, 0, 0}, false},
                {new int[]{1, 0, 0, 0}, false}
        });
    }

    @Test
    public void oneAndFour() {
        Assert.assertEquals(out, MyClass.oneAndFour(in));
    }
}

