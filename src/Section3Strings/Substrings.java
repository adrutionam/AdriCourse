package Section3Strings;

public class Substrings {
    public static void main(String[] args) {
        String myText = "apple";
        String str = myText.substring(0, 1).toUpperCase(); // we select the part myText.substring(0, 1).toUpperCase()
        // from the main string and then press command+option+v to create a separate name for the substring
        String str2 = myText.substring(1).toLowerCase();
        String myNewText = str + str2; // select str and do shift+F6 to rename
        // starts from the character we mentioned to,
        // and prints till the ending index, excluding the index.
        // If you only give the start index it will print from that index till the end
        System.out.println(myNewText);
    }
}
