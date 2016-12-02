import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

/**
 * Created by holi on 12/2/16.
 */
public class UniqueSortedArrayTest {

    @Test
    public void nil() throws Exception {
        assertThat(SortedArray.unique(null), is(nullValue()));
    }

    @Test
    public void empty() throws Exception {
        int[] array = new int[0];
        assertThat(SortedArray.unique(array), is(sameInstance(array)));
    }

    @Test
    public void singleton() throws Exception {
        int[] array = new int[1];
        assertThat(SortedArray.unique(array), is(sameInstance(array)));
    }

    @Test
    public void arrayWithDiffItems() throws Exception {
        assertThat(SortedArray.unique(new int[]{1, 2}), equalTo(new int[]{1, 2}));
    }

    @Test
    public void arrayWithSameItems() throws Exception {
        assertThat(SortedArray.unique(new int[]{1, 1}), equalTo(new int[]{1}));
    }
}
