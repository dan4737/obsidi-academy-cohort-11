package com.bptn.course;

public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(1));
        System.out.println(isPerfectSquare(4));
        System.out.println(isPerfectSquare(Integer.MAX_VALUE/100));
        System.out.println(isPerfectSquare(255));

    }

    public static boolean isPerfectSquare(int num) {// so this will return true if num is a perfect sqaure
        for(int i = 1; i <= num; i++) {//changed the operator to "<="  because te loop would have checked if 1 <1 which
            //which is false  so it would not run
            if(i * i == num)// this had to be replaced with the Comparison operator "=="
                return true;
            else if (i*i > num)
                return false;// moved this line to the bottom for readability(was previously on the same line
        }
        return false; // since this the class is a boolean we had to make sure to return a boolean result
    }
}
