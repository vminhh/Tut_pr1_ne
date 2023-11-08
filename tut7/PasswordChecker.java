package Class.tut7;
import java.util.*;

public class PasswordChecker{
    public static void main (String[] args){
        Scanner inp = new Scanner (System.in);
        System.out.print("Enter a new password: ");
        String pass = inp.nextLine();
        inp.close();

        int point = 0;
        point += (pass.length() >=8 && pass.length() <=12) ?1 :((pass.length() >12) ?2 :0);
        point += (!pass.equals(pass.toUpperCase())) ?1 :0;
        point += (!pass.equals(pass.toLowerCase())) ?1 :0;
        point += (pass.matches(".*\\d.*")) ?1 :0;
        point += (!pass.matches("[a-zA-Z0-9]")) ?1 :0;

        if (point <1)        System.out.println("Invalid password!");
        else if (point <3)   System.out.printf("Strength: %d (weak)", point);
        else if (point <5)   System.out.printf("Strength: %d (medium)", point);
        else if (point <7)   System.out.printf("Strength: %d (strong)", point);
        else  System.out.println("None of hacker can find to it =))");
    }    
}