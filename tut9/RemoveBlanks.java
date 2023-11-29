package Class.tut9;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class RemoveBlanks {
    public static void main(String[] args) {
        try {
            File input = new File("input.txt");
            Scanner inp = new Scanner (input);

            File output = new File("output.txt");
            PrintWriter out = new PrintWriter(output);

            while(inp.hasNextLine()){
                String line = inp.nextLine();
                if (!line.trim().isEmpty()){
                    out.println(line);
                }
            }

            inp.close();
            out.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error..... What the fuck have you done?");
            e.printStackTrace();
        }
    }
}

/* Đường dẫn chạy bằng terminal của pc sẽ đúng thay vì terminal của vscode khi cho file input.txt vào chung folder với file java
        https://www.w3schools.com/java/java_packages.asp (cách chạy terminal pc khi có package )
        nếu k thì xóa package ở dòng 1 "package Class.tut9" và đưa file txt ra ngoài folder;
    */
