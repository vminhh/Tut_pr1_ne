package Class.tut4;
import java.util.*;

public class Fibonacci {
    public static void main(String[] args){
        Scanner inp = new Scanner (System.in);
        long n = inp.nextLong();
        inp.close();
        for (int i=1; i<=n; i++){
            System.out.printf("%d ",Product(i));
        }
    }
    public static long Product(long n){
        if (n==0 || n==1)
            return n;
        return Product(n-1) + Product(n-2);
    }
}