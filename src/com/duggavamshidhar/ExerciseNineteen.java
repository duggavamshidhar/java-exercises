package com.duggavamshidhar;

import java.util.Scanner;

// Java Program to Check Whether a Number Is Greater Than, Less Than, or Equal to Another Number
public class ExerciseNineteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2 + ".");
        } else if (num1 < num2) {
            System.out.println(num1 + " is less than " + num2 + ".");
        } else {
            System.out.println(num1 + " is equal to " + num2 + ".");
        }
    }
}
