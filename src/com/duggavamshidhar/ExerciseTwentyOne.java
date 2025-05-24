package com.duggavamshidhar;

import java.util.Scanner;

// Java Program to Calculate Burger Order Price Based on User Choices
public class ExerciseTwentyOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Burger Shop!");
        System.out.println("Please choose your burger type: \n\t Mini Burger (M) ($5) \n\t Normal Burger (N) ($7) \n\t Large Burger (L) ($10)");
        String burgerType = sc.next().toUpperCase();
        System.out.println("Would you like to add cheese? (Y/N)");
        String cheeseChoice = sc.next().toUpperCase();
        System.out.println("Would you like to add mushroom toppings? (Y/N)");
        String mushroomChoice = sc.next().toUpperCase();
        double burgerPrice = 0.0;
        switch (burgerType) {
            case "M":
                burgerPrice = 5.0;
                break;
            case "N":
                burgerPrice = 8.0;
                break;
            case "L":
                burgerPrice = 10.0;
                break;
            default:
                System.out.println("Invalid burger type selected.");
                return;
        }
        if (cheeseChoice.matches("Y")) {
            burgerPrice += 1.0;
        }
        if (mushroomChoice.matches("Y")) {
            switch (burgerType) {
                case "M":
                case "N":
                    burgerPrice += 1.0;
                    break;
                case "L":
                    burgerPrice += 2.0;
                    break;
            }
        }
        sc.close();
        System.out.printf("Your total burger price is: $%.2f\n", burgerPrice);
    }
}
