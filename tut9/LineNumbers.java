package Class.tut9;

import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LineNumbers {
    public static void main (String[] args){
        try{
            File input  = new File("mary.txt");
            Scanner inp  = new Scanner(input);

            File output = new File("mary2.txt");
            PrintWriter out = new PrintWriter(output);

            int row = 1;
            while(inp.hasNextLine()){
                String line = inp.nextLine();
                out.println(row + ". " + line);
                row ++;
            }

            inp.close();
            out.close();
        }catch(FileNotFoundException e){
            System.err.println("Error..... What the fuck have you done?");
            e.printStackTrace();
        }
    }
}
