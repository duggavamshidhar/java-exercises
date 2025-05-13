package com.duggavamshidhar;

import java.util.Scanner;

// Java Program to Find the Largest Number Among Three Numbers
public class ExerciseFifteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter the first number: ");
        a = sc.nextInt();
        System.out.println("Enter the second number: ");
        b = sc.nextInt();
        System.out.println("Enter the third number: ");
        c = sc.nextInt();
        if (a == b && a == c) {
            System.out.println("All three numbers are equal.");
        } else if (a >= b && a >= c) {
            System.out.println(a + " is the largest number.");
        } else if (b >= c) {
            System.out.println(b + " is the largest number.");
        } else {
            System.out.println(c + " is the largest number.");
        }
        sc.close();
    }
}
