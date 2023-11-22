package Class.tut8;

public class PrintTable {
    public static void main(String[] args) {
        int[][] table ={ {8, 1, 6},
                         {3, 5, 7},
                         {4, 9, 2}
                        }; 
        print(table);
    }
    static void print(int[][] table) {
        System.out.println("+-----------+");
        for (int[] row : table) {
            System.out.print("|");
            for (int value : row) {
                System.out.print(" " + value + " |");
            }
            System.out.println("\n+-----------+");
        }
    }
}