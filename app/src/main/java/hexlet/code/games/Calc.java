package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.Constants;
import hexlet.code.utils.Operations;
import hexlet.code.utils.Utils;

public class Calc {
    private static final String RULES = "What is the result of the expression?";

    public static void run() {
        var roundsCount = Constants.ROUNDS;
        var gameData = new String[Constants.ROUNDS][2];
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
        var operation = Operations.getRandomOperation();
        var question =
                String.format("%d %s %d", firstNumber, operation.getOperation(), secondNumber);
        var answer = calculate(firstNumber, secondNumber, operation);
        return new String[] {question, String.valueOf(answer)};
    }

    private static int calculate(int first, int second, Operations operation) {
        return switch (operation) {
            case ADD -> first + second;
            case SUBTRACT -> first - second;
            case MULTIPLY -> first * second;
        };
    }
}
