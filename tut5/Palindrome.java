package Class.tut5;
import java.util.Scanner;

public class Palindrome {
    public static void main (String[] args){
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        inp.close();
        System.out.print(isPalindrome(s) ?"Yes" :"No");
    }
    
    public static boolean isPalindrome(String s){
        String x = new String(s);
        StringBuffer result = new StringBuffer(s);

        if (result.charAt(0) == '-')    result.deleteCharAt(0);
        result.reverse();
        String temp = "";

        for (int i=0; i<result.length(); i++){
            if (result.charAt(i) != '0')
                temp += result.charAt(i);
        }
        result = new StringBuffer(temp);

        return x.equals(result.toString());
    }
}
