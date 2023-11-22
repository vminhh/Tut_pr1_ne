package Class.tut8;
import java.util.*;
// import java.util.ArrayList;

public class RemoveEvenLength {
    public static void main(String[] args) {
        ArrayList<String> inp = new ArrayList<>();

        inp.add("odd");
        inp.add("even");
        inp.add("abc");
        inp.add("abcd");
        inp.add("abcde");
        inp.add("abcdef");

        System.out.println("Original list: " + inp);
        removeEvenLength(inp);
        System.out.println("Output list: " + inp);
    }

    public static void removeEvenLength(ArrayList<String> arrList){
        for (int i = arrList.size()-1; i>=0; i--){
            String temp = arrList.get(i);
            if (temp.length() %2 ==0){
                arrList.remove(i);
            }
        }
    }
}
