package Section3Strings;

public class CompareTo {
    public static void main(String[] args) {
        String firstWord = "Apple";
        String secondWord = "Banana";
        System.out.println(firstWord.compareTo(secondWord));
        // if first String comes after second String then compareTo returns a positive number if same then 0 if before then -ve
        // if you wanna ignore case and check if the word are the same
        System.out.println(firstWord.compareToIgnoreCase(secondWord));
    }
    // creating our own program to compare same words with different cases
    public static int compareToIgnoreCase(String text1, String text2){
        String lowerFirstWord = text1.toLowerCase();
        String lowerSecondWord = text2.toLowerCase();
        return lowerFirstWord.compareTo(lowerSecondWord);
    }
}
