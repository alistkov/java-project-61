package hexlet.code;

import java.util.Random;

public class Util {
    private static final Random RANDOM = new Random();

    public static int generateRandomNumber(int min, int max) {
        return RANDOM.nextInt(min, max);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int calculate(int firstNumber, int secondNumber, String operation) {
        switch (operation) {
            case "+":
                return firstNumber + secondNumber;
            case "-":
                return firstNumber - secondNumber;
            case "*":
                return firstNumber * secondNumber;
            default:
                throw new ArithmeticException();
        }
    }

    public static int getGreatestCommonDivisor(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return firstNumber;
        }
        return getGreatestCommonDivisor(secondNumber, firstNumber % secondNumber);
    }
}
