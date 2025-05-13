package com.duggavamshidhar;

import java.util.Scanner;

// Java Program to Check Whether a Number Is Positive or Negative
public class ExerciseSixteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println(num + " is a negative number.");
        } else if (num > 0) {
            System.out.println(num + " is a positive number.");
        } else {
            System.out.println("The number is zero.");
        }
        sc.close();
    }
}
