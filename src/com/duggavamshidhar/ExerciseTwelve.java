package com.duggavamshidhar;

import java.util.Scanner;

// Java Program to Check Whether a Given Number Is Even or Odd
public class ExerciseTwelve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
        sc.close();
    }
}
