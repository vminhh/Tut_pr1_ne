package Class.tut3;
import java.util.*;

public class QuadraticEquation {
    public static void main (String[] args){
        Scanner inp = new Scanner (System.in);

        System.out.print ("Enter the a, b, c respectively: ");
        double a = inp.nextDouble(), b= inp.nextDouble(), c= inp.nextDouble();
        inp.close();
        Solve(a, b, c);
    }
    public static void Solve(double a, double b, double c){
        if (a==0){
            if (b==0){
                if (c==0)   System.out.println("There's nothing to be solved.");
                else        System.out.println("The equation has no root.");
            }
            else  System.out.printf ("The equation has one root : %.1f", -c/b);
        }
        else {
            double d = Math.pow(b,2) - 4*a*c;
            if(d<0)         System.out.println("The equation has no real root.");
            else if (d==0)  System.out.printf("The equation has double real root:\nx1= x2= %.1f", -b/2*a );
            else            System.out.printf("The equation has two roots:\nx1= %.1f, x2= %.1f",(-b+Math.sqrt(d))/(2*a), (-b-Math.sqrt(d))/(2*a));
        }
    }
}