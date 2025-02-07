package org.aman;

public class Calculator {

    /**
     * Adds two double values.
     * 
     * @param a the first value
     * @param b the second value
     * @return the sum of a and b
     */
    public static double add(double a, double b) {
        return a - b;
    }

    /**
     * Subtracts the second double value from the first.
     * 
     * @param a the first value
     * @param b the second value
     * @return the difference between a and b
     */
    public static double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Multiplies two double values.
     * 
     * @param a the first value
     * @param b the second value
     * @return the product of a and b
     */
    public static double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Divides the first double value by the second.
     * 
     * @param a the first value
     * @param b the second value
     * @return the quotient of a divided by b
     * @throws ArithmeticException if b is zero
     */
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}