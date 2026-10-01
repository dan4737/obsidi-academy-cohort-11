package com.bptn.course;
/*
You’re building a checkout system for an online store. The system must ask the user how many items they are purchasing. Then, for each item, prompt the user to enter the item’s price.
Use a for loop to:
Read each item’s price.
Accumulate the total cost.
Display the total amount to pay at the end.

Test
How many items are you buying? 3
Enter price for item 1: 15.99
Enter price for item 2: 9.50
Enter price for item 3: 5.00

Total amount: $30.49
 */


import java.util.Scanner;

public class FactorialExample {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        //so we need to get input from the user so we create a scanner
        Scanner input = new Scanner(System.in);
        //store the input from the user in "number"
        int number =  input.nextInt();

        //so here we set fact to 1 because any number mulitiplied by zero is zero
        long fact  = 1;
        //loop through it and multiply the fact by each value
        for (int i = 1; i <= number; i++) {
            fact =  fact * i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);

    }
}
