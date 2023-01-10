package Section3Strings;

public class IsBlankEmpty {
    public static void main(String[] args) {
        String myText = " ";
        System.out.println(myText.isEmpty());
        // this function will return false even if there's a blank space in the string as even space char has a unicode
        System.out.println(myText.isBlank());
        //Determines whether or not there's a white space
    }
}
