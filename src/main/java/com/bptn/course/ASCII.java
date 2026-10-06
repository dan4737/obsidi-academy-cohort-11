package com.bptn.course;

import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        //create a new Scanner Object
        Scanner scanner= new Scanner(System.in);
        // now we need to ask for the value of the scanner
        System.out.println("Enter the letter you want the ASCII code for : ");

		char c =scanner.next().charAt(0) ;
        int ascii = c;
        System.out.println("The ASCII value of " + c + " is: " + ascii);
        scanner.close();

    }

}
