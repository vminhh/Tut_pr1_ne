package Class.tut9;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class BasicFileIO {
    public static void main(String[] args) {
        try {
            File file = new File("hello.txt");
            PrintWriter out = new PrintWriter(file);
            out.println("Hello, world!");
            out.close();

            Scanner inp = new Scanner(file);
            String message = inp.nextLine();
            System.out.println(message);
            inp.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
/* 
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class BasicFileIO {
    public static void main(String[] args) {
        String filename = "hello.txt";

        wirteToFile(filename, "Hello, world!");
        read_print(filename);
    }

    static void wirteToFile (String filename, String message){
        try {
            PrintWriter inp = new PrintWriter(filename);
            inp.println(message);
            inp.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found." + filename);
            e.printStackTrace();
        }
    }

    static void read_print (String filename){
        try {
            Scanner inp = new Scanner(new File(filename));

            if (inp.hasNextLine()){
                String message = inp.nextLine();
                System.out.println("Message read from the file: " + message);
            }
            else    System.out.println("Empty!!!");
        } catch (FileNotFoundException e) {
            System.err.println("File not found." + filename);
            e.printStackTrace();
        }
    }
}
*/