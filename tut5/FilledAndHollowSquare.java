package Class.tut5;
import java.util.*;

public class FilledAndHollowSquare {
    public static void main (String[] args){
        System.out.print("Enter the side length: ");
        Scanner inp = new Scanner(System.in);
        int sideLength = inp.nextInt();
        inp.close();

        for (int line=0; line<sideLength; line++){
            for (int i=0; i<sideLength; i++){
                System.out.print("*");
            }
            System.out.print(" ");
            if (line == 0 || line == sideLength-1){
                for (int i=0; i<sideLength; i++){
                    System.out.print("*");
                }
            }
            else{
                System.out.print("*");
                for (int i=1; i<sideLength-1; i++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
