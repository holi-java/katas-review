import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by holi on 12/2/16.
 */
@RunWith(Parameterized.class)
public class FibonacciTest {
    private int number;
    private int expectedValue;

    @Parameters(name = "test fibonacci({0}) == {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                it(1, 1),
                it(2, 1),
                it(3, 2),
                it(4, 3),
                it(5, 5),
        });
    }

    private static Object[] it(int number, int expectedValue) {
        return new Object[]{number, expectedValue};
    }

    public FibonacciTest(int number, int expectedValue) {
        this.number = number;
        this.expectedValue = expectedValue;
    }

    @Test
    public void test() throws Exception {
        assertThat(Fibonacci.of(number), equalTo(expectedValue));
    }
}
