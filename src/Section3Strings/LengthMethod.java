package Section3Strings;

public class LengthMethod {
    public static void main(String[] args) {
        String myText = "for";
        /* part 1
        System.out.println(myText.length());
        char[] chars = myText.toCharArray();
        System.out.println(chars[2]);
        // gives an exception if you put a number that exceeds the length, array index out of bounds
        int index = 100;
        if(index < myText.length()) {
            System.out.println(chars[index]); // this is how you safeguard or ensure no exception occurs
        }

         */
        String secondText = "score";
        StringBuilder builder = new StringBuilder(myText.length()+secondText.length())
        .append(myText)
                .append(secondText);
        System.out.println(builder.toString());
    }
}
