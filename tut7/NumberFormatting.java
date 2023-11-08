package Class.tut7;
import java.util.*;

public class NumberFormatting {
    public static void main (String[] args){
        Scanner inp = new Scanner(System.in);
        int n = 0;
        while (true){
            try{
                System.out.print("Please enter an integer between 1000 and 999999: ");
                n = inp.nextInt();
                if (n <1000 || n >999999)
                    throw new Exception("Number out of range.");
                    break;
            }catch(Exception e){
                System.out.println("Invalid input.");
                inp.nextLine();
            }
        }
        inp.close();
        System.out.println(String.format("%,d", n));
    }
}