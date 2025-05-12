package com.duggavamshidhar;

import java.util.Scanner;

// Java Program to Convert Integer Values to Byte, Character, and Float
public class ExerciseOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        byte b;
        char c;
        float f;
        a = sc.nextInt();
        b = (byte) a;
        c = (char) a;
        f = (float) a;
        System.out.println("Integer Value: " + a);
        System.out.println("Byte Value: " + b);
        System.out.println("Character Value: " + c);
        System.out.println("Float Value: " + f);
    }
}
