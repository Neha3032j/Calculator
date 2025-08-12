package com.neha.test;

import java.util.Scanner;

public class ConsoleCalculator {
	
	// Method for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is undefined.");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        char operator;
        String choice;

        System.out.println("=== Java Console Calculator ===");

        do {
            // Take first number input
            System.out.print("Enter first number: ");
            num1 = scanner.nextDouble();

            // Take operator input
            System.out.print("Enter operator (+, -, *, /): ");
            operator = scanner.next().charAt(0);

            // Take second number input
            System.out.print("Enter second number: ");
            num2 = scanner.nextDouble();

            // Perform calculation using methods
            switch (operator) {
                case '+':
                    result = add(num1, num2);
                    System.out.println("Result: " + result);
                    break;

                case '-':
                    result = subtract(num1, num2);
                    System.out.println("Result: " + result);
                    break;

                case '*':
                    result = multiply(num1, num2);
                    System.out.println("Result: " + result);
                    break;

                case '/':
                    result = divide(num1, num2);
                    if (!Double.isNaN(result)) {
                        System.out.println("Result: " + result);
                    }
                    break;

                default:
                    System.out.println("Invalid operator. Please use +, -, *, or /.");
            }

            // Ask if user wants to continue
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            choice = scanner.next();

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Calculator exited.");
        scanner.close();
    }
  
}
