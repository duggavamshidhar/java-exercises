package com.duggavamshidhar;

import java.util.Scanner;

// Java Program to Convert Long Values to Bytes
public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a;
        byte b;
        a = sc.nextLong();
        b = (byte) a;
        System.out.println("Long Value: " + a);
        System.out.println("Byte Value: " + b);
    }
}
