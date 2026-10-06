package com.bptn.course.KW;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // so here we ask the user for the three side lengths
        System.out.println("Enter three side lengths for the triangle:");
        System.out.print("Enter Side 1 length: ");
        double side1 = input.nextDouble();
        System.out.print("Enter Side 2 length: ");
        double side2 = input.nextDouble();
        System.out.print("Enter Side 3 length: ");
        double side3 = input.nextDouble();

        // Then here we will only do the calculation for the area if the three sides can form a real triangle
        if (isValid(side1, side2, side3)) {
            System.out.println("The area of the triangle is " + area(side1, side2, side3));
        } else {
            System.out.println("These sides do not form a valid triangle.");
        }
    }

    // Returns true only if the sum of every pair of sides is greater than the third side
    // SO here instead of wwriting three if statements , we just check for one condition , to see if one of the pairs is not longer than the third sid
    // so that it can exit the loop early or welse we wiuld have have to write more lines of if statements
    public static boolean isValid(double side1, double side2, double side3) {
        return (side1 + side2 > side3)
                && (side1 + side3 > side2)
                && (side2 + side3 > side1);
    }

    // Calculates the area from the three side lengths
    public static double area(double side1, double side2, double side3) {
        // s is the semi-perimeter: half of the total distance around the triangle
        double s = (side1 + side2 + side3) / 2;

        // Area = square root of s(s - side1)(s - side2)(s - side3)
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

}