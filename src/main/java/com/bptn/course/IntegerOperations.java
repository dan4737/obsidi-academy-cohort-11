package com.bptn.course;

import java.util.Scanner;


public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positives=0, negatives=0, evens=0 , odds=0, total=0, count=0;
        float average = 0.0f;
        // we need to initialize
        System.out.println("Enter an integer: " );
        int input = scanner.nextInt();// read the input from the user

        if(input ==0){
            System.out.println("no number is entered");
        }else {
            while(input!=0){
                // let's try to keep count of what numbers were answered
                System.out.print("Enter the next integer 0  to terminate the program");
                input = scanner.nextInt();
                if(input>=0){
                    positives++;
                }else{
                    negatives++;
                }
                if(input%2==0){
                    evens++;
                }else{
                    odds++;
                }
                count++;
                total+=input;
            }


        }

        scanner.close();


    }
}
