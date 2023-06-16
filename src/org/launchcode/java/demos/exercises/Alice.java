package org.launchcode.java.demos.exercises;

public class Alice {
    public static void main (String[] args) {
        java.util.Scanner input;
        String aliceText;
        String userInput;
        Boolean checker;

        input = new java.util.Scanner(System.in);


        aliceText = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";


        System.out.println("Enter a word in to see if it is in the Alice and Wonderland paragraph below:");
        userInput = input.next();

        checker = aliceText.contains(userInput); // would expect the "true" boolean when Alice is put in but is returning false

        System.out.println(checker);






    }
}