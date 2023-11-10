package Class.tut7;
import java.util.*;

public class RecursiveStringReverse {
    public static void main (String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = inp.nextLine();
        inp.close();
        System.out.println("The reverse string is: " + reverseString(s));
    }
    
    public static String reverseString (String x){
        if (x.length()<=1)  return x;
            return reverseString(x.substring(1)) + x.charAt(0); // recursion   
    }
}