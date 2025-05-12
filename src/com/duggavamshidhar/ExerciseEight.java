package com.duggavamshidhar;

import java.util.Scanner;

// Java Program to Illustrate the Use of Pre- and Post-Increment and Decrement Operators
public class ExerciseEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 10, b = 10, c = 10, d = 10;
        System.out.println("Pre-Increment: " + ++a);
        System.out.println("Post-Increment: " + b++);
        System.out.println("Pre-Decrement: " + --c);
        System.out.println("Post-Decrement: " + d--);
    }
}
