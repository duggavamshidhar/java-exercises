package com.duggavamshidhar;

// Java Program to Use Underscores in Numeric Literals
public class ExerciseFour {
    public static void main(String[] args) {
        byte b = 1_2_7;
        short s = 3_2_1_6;
        int i = 2_1_4_7_4_8_3_6_4;
        long l = 9_2_2_3_3_7_2_0_3_6_8_5_4_7_7_5_8_0_7L;
        System.out.println("Underscore Numerical Literal of byte: " + b);
        System.out.println("Underscore Numerical Literal of short: " + s);
        System.out.println("Underscore Numerical Literal of int: " + i);
        System.out.println("Underscore Numerical Literal of long: " + l);
    }
}
