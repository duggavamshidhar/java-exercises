package com.duggavamshidhar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Java Program to Read a Grade and Display the Equivalent Description
public class ExerciseSeventeen {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char a = (char) br.read();
        if (a == 'a' || a == 'A') {
            System.out.println("The student has scored more than 80 out of 100.");
        } else if (a == 'b' || a == 'B') {
            System.out.println("The student has scored between 60 and 80 out of 100.");
        } else if (a == 'c' || a == 'C') {
            System.out.println("The student has scored between 40 and 60 out of 100.");
        } else if (a == 'd' || a == 'D') {
            System.out.println("The student has failed");
        }
    }
}
