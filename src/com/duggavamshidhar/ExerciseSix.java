package com.duggavamshidhar;

import java.util.Scanner;

// Java Program to Illustrate the Use of Various Boolean Operators
public class ExerciseSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean a;
        boolean b;
        System.out.println("Enter first boolean value: ");
        a = sc.nextBoolean();
        System.out.println("Enter second boolean value: ");
        b = sc.nextBoolean();
        boolean c = a & b;
        boolean d = a | b;
        boolean e = a ^ b;
        boolean f = !a;
        boolean g = !b;
        System.out.println("Value of a & b: " + c);
        System.out.println("Value of a | b: " + d);
        System.out.println("Value of a ^ b: " + e);
        System.out.println("Value of !a: " + f);
        System.out.println("Value of !b: " + g);
        sc.close();
    }
}
