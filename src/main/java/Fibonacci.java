/**
 * Created by holi on 12/2/16.
 */
public class Fibonacci {
    public static int of(int n) {
        if (n <= 2) return 1;
        return Fibonacci.of(n - 1) + Fibonacci.of(n - 2);
    }
}
