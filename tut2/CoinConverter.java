package Class.tut2;
import java.util.*;

public class CoinConverter {
    
    public static void main(String[] args){
        
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        inp.close();

        int rates[] = {10000, 100, 10, 1};
        int values[] = new int[4];
        int xu = x;
        for (int i=0; i<4; i++){
            values[i] = xu / rates[i];
            xu %= rates[i];
        }
        
        System.out.printf("%d xu converts into: \n%d quan, %d dong, %d hao, %d xu", x, values[0], values[1], values[2], values[3]);
    }
}
