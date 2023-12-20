package Class.tut12;

import java.util.Arrays;

public class SelectionSortDemo {
    public static void main (String[] args){
        int [] A = {25, 3 ,1, 4, 6, 9, 100, 55};

        System.out.println(Arrays.toString(selectionSort(A)));
    }
    private static int[] selectionSort (int[] A){
        int[] B = new int[A.length];
        System.arraycopy(A, 0, B, 0, A.length);

        for (int i=0; i<B.length - 1; i++){
            int p = i;
            for (int j=i+1; j<B.length; j++){
                if (B[j] < B[p])
                    p = j;
            }
            int temp = B[p];
            B[p] = B[i];
            B[i] = temp;
        }
        return B;
    }
}
