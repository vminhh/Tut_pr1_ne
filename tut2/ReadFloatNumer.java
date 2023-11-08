package Class.tut2;
import java.util.*;

public class ReadFloatNumer {
    
    public static void main (String [] agrs){

        Scanner inp = new Scanner(System.in);
        float n = inp.nextFloat();
        inp.close();
        /* 
        String result = "";

        if (n==0){
            result = "The number is zero.";
        }
        else {
            if (n<0)    result += " negative number.";
            else        result += " positive number.";
        }

        if ( Math.abs(n) < 1 ){
            if ( (int)n != n)
                result = " small" + result;
        }
        else if (Math.abs(n) > 1000){
            if ( (int)n != n)
                result = " large" + result;
        }
        System.out.print( "A" + result);
        */
        String result = "";
        if (n==0.0)   System.out.print("The number is zero.");
        else {
            result = (Math.abs(n)>1000) ? "large " : ((Math.abs(n)>=1) ? "" : "small ");
            result += (n<0.0) ? "negative" : "positive" ; 
        }
        System.out.printf("A %s number.", result);
        } 
       
    }
