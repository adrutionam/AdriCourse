package Section3Strings;

public class LearnCharAt {
    public static void main(String[] args) {
        String myText = "Apples";
        int length = myText.length();
        System.out.println(myText.charAt(2));
        /* We have string where indexing starts from 0 to n-1 n being the length of the String
        * so A p p l e s
        *    0 1 2 3 4 5
        * so charAt(2) will give you the second p */
    }
}
