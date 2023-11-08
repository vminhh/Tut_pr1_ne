package Class.tut4;
import java.util.*;

public class CountDigits {
       public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        String n = inp.nextLine();
        inp.close();
        System.out.printf("%d", ( n.charAt(0)=='-') ? n.length()-1 : n.length());
    }
}
