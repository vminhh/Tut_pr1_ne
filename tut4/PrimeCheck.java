import java.util.*;

public class Solve {
    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
            long n = inp.nextLong();
            System.out.println(isPrime(n) ?"YES" :"NO");
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
