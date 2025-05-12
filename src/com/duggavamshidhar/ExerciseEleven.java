package com.duggavamshidhar;

import java.util.Scanner;

// Java program to read student marks as input and calculate the total marks and average.
public class ExerciseEleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalMarks = 0;
        double averageMarks = 0.0;
        int subA, subB, subC, subD;
        System.out.println("Enter marks for subject A: ");
        subA = sc.nextInt();
        System.out.println("Enter marks for subject B: ");
        subB = sc.nextInt();
        System.out.println("Enter marks for subject C: ");
        subC = sc.nextInt();
        System.out.println("Enter marks for subject D: ");
        subD = sc.nextInt();
        totalMarks = subA + subB + subC + subD;
        System.out.println("Total marks: " + totalMarks);
        averageMarks = (double) totalMarks / 4;
        System.out.println("Average marks: " + averageMarks);
    }
}
