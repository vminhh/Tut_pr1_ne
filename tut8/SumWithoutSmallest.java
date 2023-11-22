package Class.tut8;

public class SumWithoutSmallest {
    public static void main(String[] args) {
        int [] a = {5,4,1,3,2};
        int [] b = {3,2,2,1,2,3,4};
        int [] c = {3,2,1,2,1,2,3,4};

        System.out.println(sumWithoutSmallest(a));
        System.out.println(sumWithoutSmallest(b));
        System.out.println(sumWithoutSmallest(c));
    }

    public static int sumWithoutSmallest(int [] arr){
        if (arr == null || arr.length == 0){
            return 0;
        }

        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i : arr){
            sum += i;
            if (i < min){
                min = i;
            }
        }
        return sum - min;
    }
}
