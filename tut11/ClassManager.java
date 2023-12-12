package Class.tut11;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Scanner;

public class ClassManager {
    public static void main(String[] args) {
        Map<String, List<String>> classMap = new HashMap<>();
        Scanner inp = new Scanner(System.in);

        int choice;
        do{
            System.out.println("\t.....MENU.....\t");
            System.out.println("1. Add a student to a class");
            System.out.println("2. Display all students in a class");
            System.out.println("3. Exit");
            choice = inp.nextInt();
            inp.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayStudent();
                    break;
                case 3:
                    System.out.println("Exiting the program.....");
                    break;
                default:
                    System.out.println("Invalid choice!!!");
                    break;
            }
            inp.close();
        }while(choice != 3);
    }

    private static void addStudent (){

    }

    private static void displayStudent (){

    }
}
