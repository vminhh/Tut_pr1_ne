package Class.tut5;
import java.util.*;

public class PlayWithString {
    public static void main (String[] args){
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        inp.close();
        
        System.out.print("Uppercase: ");
        for (int i=0; i<s.length(); i++){
            if ( isUppercase(s.charAt(i)))
                System.out.print(s.charAt(i) + " ");
        }

        System.out.print("\nSecond letter: ");
        int cnt = 0;
        for (int i=0; i<s.length();i++){
            if (isLetter(s.charAt(i))){
                cnt++;
                if (cnt %2 == 0)    System.out.print(s.charAt(i) + " ");
            }
        }

        System.out.print("\nAll vowels replaced by an underscore: ");
        int vowel = 0;
        for (int i=0; i<s.length(); i++){
            if (isVowel(s.charAt(i))){
                vowel ++;
                System.out.print("_ ");
            }
            else System.out.print(s.charAt(i) + " ");
        }

        System.out.println("\nNumber of vowels: " +vowel);
        System.out.print("The positions of all vowels: ");
        for (int i=0; i<s.length(); i++){
            if (isVowel(s.charAt(i)))
                System.out.print( i+1 +" ");
        }
    }

    public static boolean isUppercase(char c){
        return c >= 'A' && c <= 'Z';
    }

    public static char isLowercase(char c){
        if (isUppercase(c)) return (char)(c-32);
        else    return c;
    }

    public static boolean isLetter(char c){
        return isUppercase(c) || (c >= 'a' && c <= 'z');
    }

    public static boolean isVowel(char c){
        c = isLowercase(c);
        return c == 'e' || c == 'u' || c == 'o' || c == 'a' || c == 'i' ;
    }
}