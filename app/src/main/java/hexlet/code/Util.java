package hexlet.code;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Util {
    private static final Random RANDOM = new Random();

    public static int generateRandomNumber(int min, int max) {
        return RANDOM.nextInt(min, max);
    }

    public static int getGreatestCommonDivisor(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return firstNumber;
        }
        return getGreatestCommonDivisor(secondNumber, firstNumber % secondNumber);
    }

    public static Map<String, String> generateProgression() {
        var progressionLength = Util.generateRandomNumber(5, 10);
        var missingIndex = Util.generateRandomNumber(0, progressionLength - 1);
        var startElement = Util.generateRandomNumber(5, 10);
        var step = Util.generateRandomNumber(2, 10);
        var map = new HashMap<String, String>();
        var progression = new String[progressionLength];

        for (var i = 0; i < progressionLength; i++) {
            var value = startElement + step * i;
            progression[i] = String.valueOf(value);
        }

        var missingElement = progression[missingIndex];
        progression[missingIndex] = "..";

        map.put("progression", String.join(" ", progression));
        map.put("missingElement", missingElement);

        return map;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (var i = 2; i < number; i += 1) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
