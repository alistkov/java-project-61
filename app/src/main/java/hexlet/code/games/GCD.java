package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;
import static hexlet.code.Engine.ROUNDS;

public class GCD {
    private static final String RULES = "Find the greatest common divisor of given numbers.";
    private static final int MIN = 1;
    private static final int MAX = 20;

    public static void startGame() {
        var gameData = new String[ROUNDS][2];

        for (var i = 0; i < ROUNDS; i++) {
            var firstNumber = Util.generateRandomNumber(MIN, MAX);
            var secondNumber = Util.generateRandomNumber(MIN, MAX);
            var question = firstNumber + " " + secondNumber;
            var correctAnswer = getGreatestCommonDivisor(firstNumber, secondNumber);
            gameData[i] = new String[] {question, String.valueOf(correctAnswer)};
        }
        Engine.startGame(RULES, gameData);
    }

    private static int getGreatestCommonDivisor(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return firstNumber;
        }
        return getGreatestCommonDivisor(secondNumber, firstNumber % secondNumber);
    }
}
