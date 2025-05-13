package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class GCD {
    private static final String RULES = "Find the greatest common divisor of given numbers.";
    public static final int ROUNDS = 3;

    public static void startGame() {
        var gameData = new String[3][2];

        for (var i = 0; i < ROUNDS; i++) {
            var firstNumber = Util.generateRandomNumber(1, 20);
            var secondNumber = Util.generateRandomNumber(1, 20);
            var question = firstNumber + " " + secondNumber;
            var correctAnswer = Util.getGreatestCommonDivisor(firstNumber, secondNumber);
            gameData[i] = new String[] {question, String.valueOf(correctAnswer)};
        }
        Engine.startGame(RULES, gameData, ROUNDS);
    }
}
