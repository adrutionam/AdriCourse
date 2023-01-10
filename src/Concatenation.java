public class Concatenation {
    public static void main(String[] args) {
        String text1 = "";
        String text2 = "";
        System.out.println(text1 + " " + text2);
        // plus sign results in String objects being created in memory so is to not be used when very large number of text is to br
        // combined especially when a looping type of code is used

        /* this method is used as it is a part of string class and it takes as input second String but can't br used with extra stuff words*/
        System.out.println(text1.concat(text2));

        System.out.println("my String literal".concat("second String literal"));

        /*There's a class called String builder that allows you to create long Strings like 1k strings together and this append method
        * returns the same StringBuilder that we used and that's why you can keep calling append on it, toString is important as the return
        * type has to be String and not StringBuilder */
        String finalString = new StringBuilder()
                .append(text1)
                .append(" ")
                .append(text2)
                .toString();
        /* here we have used default Constructor of StringBuilder() but you can also use StringBuilder(text1.length() + text2.length()
        * + 1 ) as it will allocate that much space only */
        /*String-buffer class can be used instead of StringBuilder() as it is a better version and threadsafe*/
        System.out.println(finalString);
        /*another method to concat Strings is*/
        System.out.format("%s, %s",text1,text2);
    }
}
