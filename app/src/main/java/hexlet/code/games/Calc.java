package hexlet.code.games;

import hexlet.code.GameEngine;
import hexlet.code.utils.Operations;
import hexlet.code.utils.Utils;

public class Calc {
    private static final String RULES = "What is the result of the expression?";

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
            var operation = Operations.getRandomOperation();
            var question =
                    String.format("%d %s %d", firstNumber, operation.getOperation(), secondNumber);
            var answer = calculate(firstNumber, secondNumber, operation);
            gameData[i] = new String[] {question, String.valueOf(answer)};
        }

        GameEngine.run(RULES, gameData);
    }

    private static int calculate(int first, int second, Operations operation) {
        return switch (operation) {
            case ADD -> first + second;
            case SUBTRACT -> first - second;
            case MULTIPLY -> first * second;
        };
    }
}
