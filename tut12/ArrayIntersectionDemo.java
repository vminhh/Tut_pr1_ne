package Class.tut12;

import java.util.HashSet;
import java.util.Set;

public class ArrayIntersectionDemo {
    public static void main (String[] args){
        int[] A = {1, 3, 5, 7, 9, 11};
        int[] B = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println("Intersection of A and B: " + intersect(A, B));
    }
    
    private static Set<Integer> arrToSet(int[] arr){
        Set<Integer> set = new HashSet<>();

        for (int index : arr){
            set.add(index);
        }
        return set;
    }

    private static Set<Integer> intersect(int[] A, int[] B){
        Set<Integer> setA = arrToSet(A);
        Set<Integer> setB = arrToSet(B);

        Set<Integer> C = new HashSet<>();

        if (setA.size() > setB.size()){
            Set<Integer> temp = setA;
            setB = setA;
            setB = temp;
        }

        for (int index : setA){
            if (setB.contains(index))
                C.add(index);
        }

        return C;
    }
}
