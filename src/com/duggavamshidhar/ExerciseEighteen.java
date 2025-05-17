package com.duggavamshidhar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Java Program to Check Whether Given Characters Are Uppercase, Lowercase, or Digits
public class ExerciseEighteen {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c = (char) br.read();
        if (c >= 97 && c <= 122) {
            System.out.println("The character is lowercase.");
        } else if (c >= 65 && c <= 90) {
            System.out.println("The character is uppercase.");
        } else if (c >= 48 && c <= 57) {
            System.out.println("The character is a digit.");
        } else {
            System.out.println("The character is not a letter or digit.");
        }
    }
}
