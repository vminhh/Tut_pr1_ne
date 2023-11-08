package Class.tut4;
import java.util.*;

public class SavingsCalculator {
    public static void main (String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("How much money? ");
        double m = inp.nextDouble();

        System.out.print("How many years do you want to deposit your money? ");
        double y = inp.nextDouble();

        System.out.print("What's the interest rate (%)? ");
        double r = inp.nextDouble();

        inp.close();
        System.out.printf("After %d years, you'll receive %.2f", y, m * Math.pow((1+r/100), y));
    }
}
