package com.duggavamshidhar;

// Java Program to Illustrate the Use of Binary Literals
public class ExerciseThree {
    public static void main(String[] args) {
        byte b = 0b1111111;
        short s = 0b111111111111111;
        int i = 0b1111111111111111111111111111111;
        long l = 0b111111111111111111111111111111111111111111111111111111111111111L;
        System.out.println("Binary Value (byte): " + b);
        System.out.println("Binary Value (short): " + s);
        System.out.println("Binary Value (int): " + i);
        System.out.println("Binary Value (long): " + l);
    }
}
