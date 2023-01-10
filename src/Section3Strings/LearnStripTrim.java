package Section3Strings;

public class LearnStripTrim {
    public static void main(String[] args) {
        String firstName = "  Adri  ";
        System.out.format("'%s'", firstName.stripLeading()); // only removes the leading spaces
        System.out.format("'%s'", firstName.trim()); // trim doesn't understand the white spaces existence as good as a strip method
        // multiline string or text block
        String firstTB = """
                /*will be removed */first line here
                                        second line here
                third line here
                """;
        /*stripIndent removes all the leading spaces but like not the spaces the second line has after the first line like from f to s
        like * * will not be removed but the spaces before that will be
        (will be removed)   first line here
                            *  *second line here
        third line here
        */
        System.out.format("'%s'", firstName.stripIndent());
        // you can also do this but it makes problem in formatting like giving indentations
        String firstTBalt = "first line here" +
                "second line here" +
                "third line here";
        String s = split("   Anu   ");
        System.out.format("'%s'", s);
        System.out.println();
        System.out.format("'%s'", split(firstName));
        String CourseName = "   java   ";
        System.out.format("'%s'", splitCourse(CourseName));
    }

    public static String split(String text){
        // can split the leading and trailing spaces of the string
        String MiddleString = text.stripLeading();
        System.out.format("'%s'",MiddleString);
        String FinalString = MiddleString.stripTrailing();
        System.out.format("'%s'",FinalString);
        return FinalString;
    }
    public static String splitCourse(String text){
        return text.replace(" ","");
    }
}
