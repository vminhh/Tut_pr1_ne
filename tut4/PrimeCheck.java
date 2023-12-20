package Class.tut4;
import java.util.*;

public class PrimeCheck {
    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
            long n = inp.nextLong();
            System.out.println( isPrime(n) ?"It is a prime number." :"It is not a prime number." );
        }
    }

    static boolean isPrime(long n) {
        if (n < 2 || (n > 2 && n % 2 == 0))
            return false;

        for (long i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
