package Class.tut5;
import java.util.*;

public class FloatArrayInspect{

    public static void main (String[] args){
        double[] values = getValues();
        calculateSum(values, 0);

        System.out.println("Average: " + calculateAverage(values));
        System.out.println("Smallest: " + findSmallest(values));
        System.out.println("Largest: " + findLargest(values));
        System.out.println("Range: " + calculateRange(findLargest(values), findSmallest(values)));
    }

    public static double[] getValues(){
        Scanner inp = new Scanner(System.in);
        String input = inp.nextLine();
        String[] valueStrings = input.split(" ");
        double[] values = new double[valueStrings.length];
        inp.close();
        for (int i=0; i<valueStrings.length; i++){
        values[i] = Double.parseDouble(valueStrings[i]);
        }
        return values;
    }

    static double calculateSum(double[] values, int index){
        if (index < values.length)
            return values[index] + calculateSum(values, index+1);
        else return 0;
    }

    static double calculateAverage(double[] values){
        return calculateSum(values, 0) / values.length;
    }
    
    static double findSmallest(double[] values){
        double min = values[0];
        for (double index:values){
            if (index < min)    min = index;
        }
        return min;
    }
    
    public static double findLargest(double[] values){
        double max = values[0];
        for (double index:values){
            if (index > max)    max = index;
        }
        return max;
    }

    public static double calculateRange(double max, double min){
        return max - min ;
    }
}