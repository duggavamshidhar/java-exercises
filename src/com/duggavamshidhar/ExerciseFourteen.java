package com.duggavamshidhar;

import java.util.Scanner;

// Java Program to Check if Two Numbers Are Equal
public class ExerciseFourteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        if (num1 == num2) {
            System.out.println(num1 + " is equal to " + num2 + ".");
        } else {
            System.out.println(num1 + " is not equal to " + num2 + ".");
        }
        sc.close();
    }
}
