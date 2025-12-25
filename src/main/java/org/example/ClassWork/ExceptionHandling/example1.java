package org.example.ClassWork.ExceptionHandling;

public class example1 {
    public static void main(String[] args) {
        int result;
        try {
            result = 10 / 2;
            System.out.println("result is " + result);
        }
        catch (Exception e) {
            System.out.println("Division by zero is not allowed.");
            System.out.println(e);
        }
        finally {
        System.out.println("MD JAVEED KHAN");
        }
    }
}