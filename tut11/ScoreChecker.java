package Class.tut11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ScoreChecker {
    public static void main(String[] args) {
        Map<String, Double> student  = new HashMap<>();
        initializeScore(student);

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = inp.nextLine().toLowerCase();
        Double score = student.get(name);
        inp.close();

        System.out.println( (score != null) ?score :"Score not found......");
    }

    private static void initializeScore(Map<String, Double> student){
        student.put("minh", 6.5);
        student.put("minhh", 7.5);
    }
}
