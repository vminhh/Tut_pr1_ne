package Class.tut8;

public class CountLastDigits {
    public static void main(String[] args) {
        int [] test = {9, 29, 44, 103, 2, 52, 12, 12, 76, 35, 20} ;
        int [] result = countLastDigits(test);

        System.out.println("Original Array: " + java.util.Arrays.toString(test));
        System.out.println("Counts of last digits: " + java.util.Arrays.toString(result));
    }

    public static int[] countLastDigits(int[] list){
        int[] counts = new int[10];
        for (int num : list){
            counts[num % 10]++;
        }
        return counts;
    }
}
