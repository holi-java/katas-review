/**
 * Created by holi on 12/2/16.
 */
public class FuzzBuzz {

    private static final String FUZZ = "Fuzz";
    private static final String BUZZ = "Buzz";

    public static String of(int n) {
        if (fuzz(n) && buzz(n)) return FUZZ + BUZZ;
        if (fuzz(n)) return FUZZ;
        if (buzz(n)) return BUZZ;
        return String.valueOf(n);
    }

    private static boolean fuzz(int n) {
        return n % 3 == 0;
    }

    private static boolean buzz(int n) {
        return n % 5 == 0;
    }
}
