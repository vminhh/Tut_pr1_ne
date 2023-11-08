package Class.tut5;
import java.util.*;

public class DecToBin {
    public static void main (String[] args){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        inp.close();
        
        toBinary(n);
    }
    public static void toBinary(int n){
        int[] a;
        int i=0;
        a = new int[100];

        while(n>0){
            a[i] = n%2;
            n/=2;
            i++;
        }
        for (int j=i-1; j>=0; j--){
            System.out.print(a[j]);
        }
    }
}
