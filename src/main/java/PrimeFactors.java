import java.util.ArrayList;
import java.util.List;

/**
 * Created by holi on 12/2/16.
 */
public class PrimeFactors {
    public static List<Integer> of(int n) {
        List<Integer> primes = new ArrayList<>();
        for (int candidate = 2; n > 1; candidate++) {
            while (n % candidate == 0) {
                primes.add(candidate);
                n /= candidate;
            }
        }
        return primes;
    }
}
