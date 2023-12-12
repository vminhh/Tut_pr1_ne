package Class.tut11;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
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
                    addStudent(classMap, inp);
                    break;
                case 2:
                    displayStudent(classMap, inp);
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

    private static void addStudent (Map<String, List<String>> classMap, Scanner inp){
        System.out.print("Enter the class name: ");
        String className = inp.nextLine();

        List<String> student = classMap.getOrDefault(className, new ArrayList<>());
        System.out.print("Enter the name of student: ");
        String studentName = inp.nextLine();

        student.add(studentName);
        classMap.put(className, student);
        System.out.println("Student added to the class successfully.");
    }

    private static void displayStudent (Map<String, List<String>> classMap, Scanner inp){
        System.out.print("Enter the class name: ");
        String className = inp.nextLine();

        List<String> students = classMap.get(className);

        if (students != null){
            System.out.println("Students in class " + className + ":");
            for (String student : students ){
                System.out.print(student + " ");
            }
        }
        else    System.out.println("Class not found......");
    }
}