/**
 * Created by holi on 12/2/16.
 */
public class SortedArray {
    public static int[] unique(int[] array) {
        if (array == null || array.length <= 1) return array;

        int[] filtered = new int[array.length];
        int n = 0;
        long prev = Long.MIN_VALUE;
        for (int item : array) {
            if (prev != item) {
                filtered[n++] = item;
            }
            prev = item;
        }
        return copy(filtered, n);
    }

    private static int[] copy(int[] array, int n) {
        int[] result = new int[n];
        System.arraycopy(array, 0, result, 0, n);
        return result;
    }
}
