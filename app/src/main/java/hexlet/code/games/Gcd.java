package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.Constants;
import hexlet.code.utils.Utils;

public class Gcd {
    private static final String RULES = "Find the greatest common divisor of given numbers.";

    public static void run() {
        var roundsCount = Constants.ROUNDS;
        var gameData = new String[roundsCount][2];

        for (var i = 0; i < roundsCount; i += 1) {
            gameData[i] = generateQuestionData();
        }
        Engine.run(RULES, gameData);
    }

    private static String[] generateQuestionData() {
        var firstNumber =
                Utils.generateRandomNumber(
                        Constants.MIN_RANDOM_NUMBER, Constants.MAX_RANDOM_NUMBER);
        var secondNumber =
                Utils.generateRandomNumber(
                        Constants.MIN_RANDOM_NUMBER, Constants.MAX_RANDOM_NUMBER);

        var question = String.format("%d %d", firstNumber, secondNumber);
        var answer = getGreatestCommonDivisor(firstNumber, secondNumber);
        return new String[] {question, String.valueOf(answer)};
    }

    private static int getGreatestCommonDivisor(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return firstNumber;
        }
        return getGreatestCommonDivisor(secondNumber, firstNumber % secondNumber);
    }
}
