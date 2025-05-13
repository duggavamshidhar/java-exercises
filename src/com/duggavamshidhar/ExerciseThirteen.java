package com.duggavamshidhar;

import java.util.Scanner;

// Java Program to Check if the Input Number Is Divisible by 5
public class ExerciseThirteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (num % 5 == 0) {
            System.out.println(num + " is divisible by 5.");
        } else {
            System.out.println(num + " is not divisible by 5.");
        }
        sc.close();
    }
}
