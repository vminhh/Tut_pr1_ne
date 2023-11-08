package Class.tut4;

public class ArmstrongNumber {
    public static void main(String[] args){
        System.out.print("The Armstrong's number between 100 and 999 are: ");
        for (int i=100; i<=999; i++){
            if (isArmstrong(i))
                System.out.printf("%d ", i);
        }
    }
   public static boolean isArmstrong(int n){
        int sum = 0;
        int origin = n;
        int[] powers = {0, 1, 8, 27, 64, 125, 216, 343, 512, 729};

        while(n>0) {
            int digit = n%10;
            sum += powers[digit];
            n /= 10;
        }
        return sum == origin;
    }
}
