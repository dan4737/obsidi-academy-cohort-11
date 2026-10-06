package com.bptn.course;

// Import the Scanner class so the program can read what the user types
import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        // So this will get the input from the user
        Scanner input = new Scanner(System.in);
        // Declare choice outside the loop so the while condition at the bottom can use it
        int choice;

        // A do-while loop runs the body once first, then checks whether to repeat
        do {
            // Print the first menu option
            System.out.println("Press 1 for Palindrome Check");
            // Print the second menu option
            System.out.println("Press 2 to Reverse a String");
            // Print the third menu option
            System.out.println("Press 3 for String Comparison");
            // Ask the user to pick an option
            System.out.println("Enter your selection: ");
            //so here we check what the user wrote and then put it in choice
            choice = input.nextInt();
            input.nextLine();

            // Options 1 and 2 both need one string and its reverse, so they share this block
            if (choice == 1 || choice == 2) {
                // Ask the user to input a word
                System.out.println("Enter any word :");
                // Read the whole line the user typed and store it in text
                String text = input.nextLine();

                // so from the class we saw in one example that we could store the reverse text
                String reversed = "";
                // Start i at the last index and count down to 0 to the first index
                for (int i = text.length() - 1; i >= 0; i--) {
                    // Add the character at index i to the end of the reversed word the usr put in
                    reversed = reversed + text.charAt(i);
                }

                // Now we need to check whether what the user picked was palindrome
                if (choice == 1) {
                    if (text.equals(reversed)) {
                        System.out.println(text + " is a palindrome.");
                    } else {
                        System.out.println(text + " is not a palindrome.");
                    }
                } else {
                    // so now we can just Print the original string followed by its reverse
                    System.out.println(text + " reversed is " + reversed);

                }

                // now we need to check whether the user picked the comparison option
            } else if (choice == 3) {
                System.out.println("Enter the first String: ");
                String first = input.nextLine();
                System.out.println("Enter the second String: ");
                String second = input.nextLine();

                // so using equals we basically compare the characters to see if they are equal
                if (first.equals(second)) {
                    System.out.println("The entered Strings are equal.");
                } else {
                    System.out.println("The entered Strings are not equal.");
                }
            } else {
                System.out.println("Invalid choice! Please make a valid choice!");
            }
            // If choice is not there we just deisplay the meny again after telling them that the choice was invalid
        } while (choice < 1 || choice > 3);
    }
}