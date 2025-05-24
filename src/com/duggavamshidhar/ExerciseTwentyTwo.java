package com.duggavamshidhar;

import java.util.Scanner;

// Java Program to Calculate Gross Pay with Overtime
public class ExerciseTwentyTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of hours worked in a week: ");
        int hoursWorked = sc.nextInt();
        System.out.print("Enter the hourly wage: ");
        double hourlyWage = sc.nextDouble();
        double grossPay;
        if ( hoursWorked <= 40 ) {
            grossPay = hoursWorked * hourlyWage;
        } else {
            int overtimeHours = hoursWorked - 40;
            double regularPay = 40 * hourlyWage;
            double overtimePay = overtimeHours * (hourlyWage * 1.5);
            grossPay = regularPay + overtimePay;
        }
        sc.close();
        System.out.printf("Gross Pay: $%.2f%n", grossPay);
    }
}
