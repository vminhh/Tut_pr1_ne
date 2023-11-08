package Class.tut4;
import java.util.*;

public class FactorialCalculator {
    public static void main (String[] args){
        Scanner inp = new Scanner(System.in);
        long n = inp.nextLong();
        inp.close();
        System.out.printf("Factorial of %d is %d", n, Factorail(n));
    }
    public static long Factorail(long n){
        if (n<2)
            return 1;
        return n * Factorail(n-1);
    }
}
