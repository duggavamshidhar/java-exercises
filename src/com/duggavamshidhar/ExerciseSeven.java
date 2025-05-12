package com.duggavamshidhar;

import java.util.Scanner;

// Java Program to Find the Largest of Three Numbers Using the Ternary Operator
public class ExerciseSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.println("Enter first number: ");
        a = sc.nextInt();
        System.out.println("Enter second number: ");
        b = sc.nextInt();
        System.out.println("Enter third number: ");
        c = sc.nextInt();
        int largest = (a > b) && (a > c) ? a : (b > c) ? b : c;
        System.out.println("Largest number is: " + largest);
    }
}
