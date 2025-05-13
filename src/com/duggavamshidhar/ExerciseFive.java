package com.duggavamshidhar;

import java.util.Scanner;

// Java Program to Perform Relational Operations
public class ExerciseFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Enter first number: ");
        a = sc.nextInt();
        System.out.println("Enter second number: ");
        b = sc.nextInt();
        System.out.println("First number is greater than second number: " + (a > b));
        System.out.println("First number is less than second number: " + (a < b));
        System.out.println("First number is equal to second number: " + (a == b));
        System.out.println("First number is not equal to second number: " + (a != b));
        System.out.println("First number is greater or equal to second number: " + (a > b));
        System.out.println("First number is lesser or equal to second number: " + (a < b));
        sc.close();
    }
}
