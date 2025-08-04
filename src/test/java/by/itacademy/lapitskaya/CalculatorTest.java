package by.itacademy.lapitskaya;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculatorTest {
    private ICalculator calculator = new Calculator();

    @Test
    @DisplayName("The sum of two positive numbers: 4 + 5 = 9")
    @Order(1)
    void testSumOfTwoPositiveNumbers() {
        int expected = 9;
        int actual = calculator.sum(4, 5);
        Assertions.assertEquals(expected, actual, String.format("The expected sum of the numbers is %d, but actual sum is %d", expected, actual));
    }

    @Test
    @DisplayName("The sum of two negative numbers: -15 + (-5) = -20")
    @Order(2)
    void testSumOfTwoNegativeNumbers() {
        int expected = -20;
        int actual = calculator.sum(-15, -5);
        Assertions.assertEquals(expected, actual, String.format("The expected sum of the numbers is %d, but actual sum is %d", expected, actual));
    }

    @Test
    @DisplayName("The sum of positive and negative numbers: -30 + 19 = 11")
    @Order(3)
    void testSumOfNegativeAndPositiveNumbers() {
        int expected = -11;
        int actual = calculator.sum(-30, 19);
        Assertions.assertEquals(expected, actual, String.format("The expected sum of the numbers is %d, but actual sum is %d", expected, actual));
    }

    @Test
    @DisplayName("The sum of two zeros: 0 + 0 = 0")
    @Order(4)
    void testSumOfTwoZeroes() {
        int expected = 0;
        int actual = calculator.sum(0, 0);
        Assertions.assertEquals(expected, actual, String.format("The expected sum of the numbers is %d, but actual sum is %d", expected, actual));
    }

    @Test
    @DisplayName("The sum of the number with zero: 90 + 0 = 0")
    @Order(5)
    void testSumOfNumberWithZero() {
        int expected = 90;
        int actual = calculator.sum(90, 0);
        Assertions.assertEquals(expected, actual, String.format("The expected sum of the numbers is %d, but actual sum is %d", expected, actual));
    }

    @Test
    @DisplayName("The sum of the numbers equal to the minimal value of int: (-1147483648) + (-1000000000) = -2147483648")
    @Order(6)
    void testSumOfNumbersEqualToTheMinValueOfInt() {
        int expected = -2147483648;
        int actual = calculator.sum(-1147483648, -1000000000);
        Assertions.assertEquals(expected, actual, String.format("The expected sum of the numbers is %d, but actual sum is %d", expected, actual));
    }

    @Test
    @DisplayName("The sum of the numbers equal to the maximum value of int: 2147483547 + 100 = 2147483647")
    @Order(7)
    void testSumOfNumbersEqualToTheMaxValueOfInt() {
        int expected = 2147483647;
        int actual = calculator.sum(2147483547, 100);
        Assertions.assertEquals(expected, actual, String.format("The expected sum of the numbers is %d, but actual sum is %d", expected, actual));
    }

    @Test
    @DisplayName("EXCEPTION: The sum of the numbers goes beyond the maximum limit of int")
    @Order(8)
    void testMaxSumException() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.sum(2147483646, 2);
        });
    }

    @Test
    @DisplayName("EXCEPTION: The sum of the numbers goes beyond the minimum limit of int")
    @Order(9)
    void testMinSumException() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.sum(-2147483648, -2);
        });
    }

    @Test
    @DisplayName("The multiplication of two positive numbers: 3 * 10 = 30")
    @Order(10)
    void testMultiplicationOfTwoPositiveNumbers() {
        int expected = 30;
        int actual = calculator.multiply(3, 10);
        Assertions.assertEquals(expected, actual, String.format("The expected result of the multiplication is %d, but actual sum is %d", expected, actual));
    }

    @Test
    @DisplayName("The multiplication of two negative numbers: (-5) * (-5) = 25")
    @Order(11)
    void testMultiplicationOfTwoNegativeNumbers() {
        int expected = 25;
        int actual = calculator.multiply(-5, -5);
        Assertions.assertEquals(expected, actual, String.format("The expected result of the multiplication is %d, but actual sum is %d", expected, actual));
    }

    @Test
    @DisplayName("The multiplication of two zeros: 0 + 0 = 0")
    @Order(12)
    void testMultiplicationOfTwoZeroes() {
        int expected = 0;
        int actual = calculator.multiply(0, 0);
        Assertions.assertEquals(expected, actual, String.format("The expected result of the multiplication is %d, but actual sum is %d", expected, actual));
    }

    @Test
    @DisplayName("The multiplication of the number with zero: 21 * 0 = 0")
    @Order(13)
    void testMultiplicationOfNumberWithZero() {
        int expected = 0;
        int actual = calculator.multiply(21, 0);
        Assertions.assertEquals(expected, actual, String.format("The expected result of the multiplication is %d, but actual sum is %d", expected, actual));
    }

    @Test
    @DisplayName("The multiplication of the numbers equal to the minimal value of int: 1073741824 * (-2) = -2147483648")
    @Order(14)
    void testMultiplicationOfNumbersEqualToTheMinValueOfInt() {
        int expected = -2147483648;
        int actual = calculator.multiply(1073741824, -2);
        Assertions.assertEquals(expected, actual, String.format("The expected result of the multiplication is %d, but actual sum is %d", expected, actual));
    }

    @Test
    @DisplayName("The multiplication of the numbers equal to the maximum value of int: 2147483547 + 100 = 2147483647")
    @Order(15)
    void testMultiplicationOfNumbersEqualToTheMaxValueOfInt() {
        int expected = 2147483647;
        int actual = calculator.multiply(2147483647, 1);
        Assertions.assertEquals(expected, actual, String.format("The expected result of the multiplication is %d, but actual sum is %d", expected, actual));
    }

    @Test
    @DisplayName("EXCEPTION: The multiplication of the numbers goes beyond the maximum limit of int")
    @Order(16)
    void testMaxMultiplicationException() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.multiply(214748364, 20);
        });
    }

    @Test
    @DisplayName("EXCEPTION: The multiplication of the numbers goes beyond the minimum limit of int")
    @Order(17)
    void testMinMultiplicationException() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.multiply(-2147483648, -2);
        });
    }

    @Test
    @DisplayName("The subtraction of two positive numbers: 100 - 10 = 90")
    @Order(18)
    void testSubtractionOfTwoPositiveNumbers() {
        int expected = 90;
        int actual = calculator.subtract(100, 10);
        Assertions.assertEquals(expected, actual, String.format("The expected result of the subtraction is %d, but actual sum is %d", expected, actual));
    }

    @Test
    @DisplayName("The subtraction of two negative numbers: -13 - (-7) = -6")
    @Order(19)
    void testSubtractionOfTwoNegativeNumbers() {
        int expected = -6;
        int actual = calculator.subtract(-13, -7);
        Assertions.assertEquals(expected, actual, String.format("The expected result of the subtraction is %d, but actual sum is %d", expected, actual));
    }

    @Test
    @DisplayName("The subtraction of negative and positive numbers: -13 - 13 = -26")
    @Order(20)
    void testSubtractionOfNegativeAndPositiveNumber() {
        int expected = -26;
        int actual = calculator.subtract(-13, 13);
        Assertions.assertEquals(expected, actual, String.format("The expected result of the subtraction is %d, but actual sum is %d", expected, actual));
    }

    @Test
    @DisplayName("EXCEPTION: The subtraction of the numbers goes beyond the minimum limit of int")
    @Order(21)
    void testMinSubtractionException() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.subtract(-2147483647, 3);
        });
    }

    @Test
    @DisplayName("EXCEPTION: The subtraction of the numbers goes beyond the maximum limit of int")
    @Order(22)
    void testMaxSubtractionException() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.subtract(2147483645, -3);
        });
    }

    @Test
    @DisplayName("The division of two positive numbers: 30 / 10 = 3.0")
    @Order(23)
    void testDivisionOfTwoPositiveNumbers() {
        double expected = 3.0;
        double actual = calculator.divide(30, 10);
        Assertions.assertEquals(expected, actual, ("The expected result of the division is 3.0"));
    }

    @Test
    @DisplayName("The division of two negative numbers: -30 / (-6) = 5.0")
    @Order(24)
    void testDivisionOfTwoNegativeNumbers() {
        double expected = 5.0;
        double actual = calculator.divide(-30, -6);
        Assertions.assertEquals(expected, actual, ("The expected result of the division is 5.0"));
    }

    @Test
    @DisplayName("The subtraction of negative and positive numbers: -13 - 13 = -26")
    @Order(25)
    void testDivisionOfNegativeAndPositiveNumber() {
        double expected = -1.0;
        double actual = calculator.divide(-13, 13);
        Assertions.assertEquals(expected, actual, String.format("The expected result of the division is -1"));
    }

    @Test
    @DisplayName("EXCEPTION: The Dividing by 0")
    @Order(26)
    void testDivisionByZeroException() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.divide(18, 0);
        });
    }
}
