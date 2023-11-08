package Class.tut4;
import java.util.*;

public class PrimeCheck {
    public static void main (String[] args){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        inp.close();
        System.out.printf("%s", (Product(n))? "It is a prime number." :"It is not a prime number.");
    }
    public static boolean Product(int n){
        if (n<2 || n%2==0){
            return false;
        }
        for (int i=2; i*i<=n; i++){
            if (n%i==0)
                return false;
        }
        return true;
    }
}