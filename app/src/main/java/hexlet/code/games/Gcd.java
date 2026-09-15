package hexlet.code.games;

import hexlet.code.GameEngine;
import hexlet.code.utils.Utils;

public class Gcd {
    private static final String RULES = "Find the greatest common divisor of given numbers.";

    public static void run() {
        var roundsCount = GameEngine.getRoundsCount();
        var gameData = new String[roundsCount][2];

        for (var i = 0; i < roundsCount; i += 1) {
            var firstNumber =
                    Utils.generateRandomNumber(
                            GameEngine.getMinRandomNumber(), GameEngine.getMaxRandomNumber());
            var secondNumber =
                    Utils.generateRandomNumber(
                            GameEngine.getMinRandomNumber(), GameEngine.getMaxRandomNumber());

            var question = String.format("%d %d", firstNumber, secondNumber);
            var answer = getGreatestCommonDivisor(firstNumber, secondNumber);
            gameData[i] = new String[] {question, String.valueOf(answer)};
        }

        GameEngine.run(RULES, gameData);
    }

    private static int getGreatestCommonDivisor(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return firstNumber;
        }
        return getGreatestCommonDivisor(secondNumber, firstNumber % secondNumber);
    }
}
