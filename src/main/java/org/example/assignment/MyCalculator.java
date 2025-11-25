package org.example.assignment;
import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("********Choose Menu*******");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        System.out.print("Enter your first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter your second number: ");
        double num2 = input.nextDouble();
        double result;
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
                break;
        }

    }
}

