package Class.tut3;
import java.util.*;

public class LeapYear {
    public static void main (String[] args){
        Scanner inp = new Scanner (System.in);
        System.out.print("Enter the year: ");
        int y = inp.nextInt();
        inp.close();
        String result = (y%4 == 0)? ((y%100 ==0) ? ((y%400==0)? "is" :"is not"): "is") :"is not";
        System.out.printf("The year %d %s a leap year.", y, result );
    }
}