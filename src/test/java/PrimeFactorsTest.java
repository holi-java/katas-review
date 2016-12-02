import org.junit.Test;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by holi on 12/2/16.
 */
public class PrimeFactorsTest {
    @Test
    public void noFactors() throws Exception {
        assertThat(PrimeFactors.of(1), is(empty()));
    }

    @Test
    public void primeNumber() throws Exception {
        assertThat(PrimeFactors.of(2), equalTo(singletonList(2)));
        assertThat(PrimeFactors.of(3), equalTo(singletonList(3)));
    }

    @Test
    public void sameFactors() throws Exception {
        assertThat(PrimeFactors.of(4), equalTo(asList(2, 2)));
        assertThat(PrimeFactors.of(8), equalTo(asList(2, 2, 2)));
        assertThat(PrimeFactors.of(9), equalTo(asList(3, 3)));
    }

    @Test
    public void diffFactors() throws Exception {
        assertThat(PrimeFactors.of(6), equalTo(asList(2, 3)));
    }
}
