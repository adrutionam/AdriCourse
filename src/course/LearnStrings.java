package course;

public class LearnStrings {
    public static void main(String [] args ){
        //different ways to create string
        String fruit = "Apple"; // we are storing a reference to the object apple here
        String anotherFruit = "Apple"; // in this case java searches through memory and if it sees that there
        // is an apple string already present then it will reference you to that memory location
        String vegetable = new String("broccoli");
        // in this type it doesn't check if the string is already present it just allocates memory regardless
        String anotherVegetable = new String("broccoli");
        // a way to check the above given fact is that
    }
}
