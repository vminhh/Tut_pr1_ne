package Class.tut11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class BuildVocabulary {
    public static void main (String[] args){
        String filePath = "C:\\LANGUAGE PROGRAMING\\JAVA\\Class\\tut11\\test.txt";
        Set<String> vocab = buildVocab(filePath);

        for (String word : vocab){
            System.out.println(word);
        }
    }

    private static Set<String> buildVocab(String filePath){
        Set<String> vocab = new HashSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while((line = reader.readLine()) != null){

                String[] words = line.toLowerCase().split("\\s+");
                for (String word : words){
                    word = word.replaceAll("[^a-zA-Z]", "");
                    if( !word.isEmpty())
                        vocab.add(word);
                }   
            }
        }catch( IOException e){
            System.err.println("File not found?.......");
            e.printStackTrace();
        }

        return vocab;
    }
}