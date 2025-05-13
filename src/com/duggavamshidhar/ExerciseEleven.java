package com.duggavamshidhar;

import java.util.Scanner;

// Java Program to Read Student Marks as Input and Calculate the Total Marks and Average
public class ExerciseEleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int subA, subB, subC, subD;
        System.out.println("Enter marks for subject A: ");
        subA = sc.nextInt();
        System.out.println("Enter marks for subject B: ");
        subB = sc.nextInt();
        System.out.println("Enter marks for subject C: ");
        subC = sc.nextInt();
        System.out.println("Enter marks for subject D: ");
        subD = sc.nextInt();
        int totalMarks = subA + subB + subC + subD;
        System.out.println("Total marks: " + totalMarks);
        double averageMarks = (double) totalMarks / 4;
        System.out.println("Average marks: " + averageMarks);
        sc.close();
    }
}
