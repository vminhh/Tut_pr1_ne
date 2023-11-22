package Class.tut8;

public class TextCleaning {
    public static void main(String[] args) {
        String Original = "Roses are red. Violets are blue, Sugar is sweet... And so are you.";
        System.out.println("Original: " + Original);
        System.out.println("Cleaned: " + cleanText(Original));
    }
    
    public static String cleanText(String content){
        if (content == null)    
            return null;
        
        StringBuilder cleanedText = new StringBuilder();
        for (char c : content.toCharArray()){
            if (Character.isLetterOrDigit(c) || Character.isWhitespace(c)){
                cleanedText.append(Character.toLowerCase(c));
            }
        }
        return cleanedText.toString();
    }
}
