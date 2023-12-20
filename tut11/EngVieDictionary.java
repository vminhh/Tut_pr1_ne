package Class.tut11;

import java.util.*;

public class EngVieDictionary {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        initializeDictionary(dictionary);
        
        Scanner inp = new Scanner(System.in);

        int choice;
        do{
            System.out.print("Enter your word: ");
            String word = inp.nextLine().toLowerCase();
            String meaning = dictionary.get(word);

            System.out.println(String.format(( meaning != null ?"Meaning: %s" :"Meaning not found"), meaning ));

            System.out.print("Do youwants to look up another word (1 for yes, 2 for no): ");
            choice = inp.nextInt();
            //choice = readInt(inp);
            inp.nextLine();
            
        }while(choice == 1);

        inp.close();
    }

    private static void initializeDictionary (Map<String, String> dictionary){
        dictionary.put("hello", "xin chào");
        dictionary.put("one", "một");
        dictionary.put("two", "hai");
        dictionary.put("java", "thứ đang giết chết bạn");
    }
    /*private static int readInt(Scanner inp) {
        while (!inp.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            inp.nextLine();
        }
        return inp.nextInt();
    }*/
}
