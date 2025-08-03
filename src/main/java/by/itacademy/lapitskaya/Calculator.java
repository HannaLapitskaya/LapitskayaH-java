package by.itacademy.lapitskaya;

public class Calculator implements ICalculator {
    @Override
    public int sum(int a, int b) {
        long result = (long) a + b;

        if (result < Integer.MIN_VALUE) {
            throw new ArithmeticException(String.format("The sum of %d and %d is greater than min integer value - %d", a, b, Integer.MIN_VALUE));
        } else if (result > Integer.MAX_VALUE) {
            throw new ArithmeticException(String.format("The sum of %d and %d is greater than max integer value - %d", a, b, Integer.MAX_VALUE));
        }

        return a + b;
    }

    @Override
    public int multiply(int a, int b) {
        long result = (long) a * b;

        if (result < Integer.MIN_VALUE) {
            throw new ArithmeticException(String.format("The product of %d and %d is greater than min integer value - %d", a, b, Integer.MIN_VALUE));
        } else if (result > Integer.MAX_VALUE) {
            throw new ArithmeticException(String.format("The product of %d and %d is greater than max integer value - %d", a, b, Integer.MAX_VALUE));
        }

        return a * b;
    }

    @Override
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by 0 is not allowed");
        }

        return (double) a / b;
    }

    @Override
    public int subtract(int a, int b) {
        long result = (long) a - b;

        if (result < Integer.MIN_VALUE) {
            throw new ArithmeticException(String.format("The subtraction of %d and %d is greater than min integer value - %d", a, b, Integer.MIN_VALUE));
        } else if (result > Integer.MAX_VALUE) {
            throw new ArithmeticException(String.format("The sum of %d and %d is greater than max integer value - %d", a, b, Integer.MAX_VALUE));
        }

        return a - b;
    }
}
