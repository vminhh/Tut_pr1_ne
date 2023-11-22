package Class.tut3;
import java.util.*;

public class AgeCheck {
    public static void main (String[] args){
        Scanner inp = new Scanner (System.in);
        System.out.print("What's your age?");
        int age = inp.nextInt();
        inp.close();
        System.out.printf("%s\n", (age<13)?"You're too young!" : ((age>19)?"“You're too old!" : "Welcome, teenager!"));
    }
}