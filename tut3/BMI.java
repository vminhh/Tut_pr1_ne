package Class.tut3;
import java.util.*;

public class BMI {
    public static void main (String [] args){
        Scanner inp = new Scanner (System.in);

        System.out.print("Enter your weight (kg): ");
        double w = inp.nextDouble();
        System.out.print("Enter your height (m): ");
        double h = inp.nextDouble();
        inp.close();
        System.out.print("Your BMI: " + Product(w, h) + " (kg/m2)");
    }
    public static double Product(double w, double h){
        return w/(Math.pow(h,2));
    }
}