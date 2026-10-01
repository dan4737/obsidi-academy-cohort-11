package com.bptn.course;

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
