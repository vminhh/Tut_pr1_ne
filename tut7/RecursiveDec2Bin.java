package Class.tut7;
import java.util.*;

public class RecursiveDec2Bin {
    public static void main (String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int decimal = inp.nextInt();
        inp.close();

        System.out.print(String.format("Binary: %s", toBin(decimal)));
    }

    public static String toBin(int decimal){
        if (decimal == 0)   return "0";
        else if (decimal == 1)  return "1";
        else {
            return toBin(decimal / 2) + (decimal % 2);   // recursion
        }
    }
}
