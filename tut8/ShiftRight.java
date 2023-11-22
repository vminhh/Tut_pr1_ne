package Class.tut8;

public class ShiftRight {
    public static void main(String[] args) {
        int[] test = {3, 8, 19, 7};

        System.out.println("Original Array: " + java.util.Arrays.toString(test));
        shiftRight(test);
        System.out.println("Shift array(1): " + java.util.Arrays.toString(test));
        shiftRight(test);
        System.out.println("Shift array(2): " + java.util.Arrays.toString(test));
        System.out.println(".................");
    }

    public static void shiftRight(int[] arr){
        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("Empty!!");

        int lastEle = arr[arr.length - 1];
        for (int i= arr.length-1; i>0; i--){
            arr[i] = arr[i - 1];
        }
        arr[0] = lastEle;
    }
}
