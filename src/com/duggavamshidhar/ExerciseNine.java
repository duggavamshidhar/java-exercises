package com.duggavamshidhar;

//Java Program to Swap Two Numbers
public class ExerciseNine {
    public static void main(String[] args) {
        swapMethodOne();
        System.out.println("============================");
        swapMethodTwo();
    }

    public static void swapMethodOne() {
        int a = 10, b = 20;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("---Method One---");
        System.out.println("First Number: " + a);
        System.out.println("Second Number: " + b);
    }

    public static void swapMethodTwo() {
        int m = 5, n = 50;
        m = m + n;
        n = m - n;
        m = m - n;
        System.out.println("---Method Two---");
        System.out.println("First Number: " + m);
        System.out.println("Second Number: " + n);
    }
}
