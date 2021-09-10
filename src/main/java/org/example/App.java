/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    // Function prompts user for age and prints out if they are old enough to drive using ternary op.
    public static void main( String[] args )
    {
        int age;
        String checkAge;

        System.out.println("What is your age?");
        Scanner inputAge = new Scanner(System.in);
        age = inputAge.nextInt();

        checkAge = (age >= 16) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";

        System.out.println(checkAge);
    }
}
