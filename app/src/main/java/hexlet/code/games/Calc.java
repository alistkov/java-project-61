package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;
import static hexlet.code.Engine.ROUNDS;

public class Calc {
    private static final String RULES = "What is the result of the expression?";
    private static final String[] OPERATIONS = {"+", "-", "*"};
    private static final int MIN = 1;
    private static final int MAX = 100;
    private static final int START_INDEX = 0;

    public static void startGame() {
        var gameData = new String[ROUNDS][2];

        for (var i = 0; i < ROUNDS; i++) {
            var operationIndex = Util.generateRandomNumber(START_INDEX, OPERATIONS.length);
            var firstNumber = Util.generateRandomNumber(MIN, MAX);
            var secondNumber = Util.generateRandomNumber(MIN, MAX);
            var operation = OPERATIONS[operationIndex];
            var question = firstNumber + " " + operation + " " + secondNumber;
            var correctAnswer = calculate(firstNumber, secondNumber, operation);
            gameData[i] = new String[] {question, String.valueOf(correctAnswer)};
        }
        Engine.startGame(RULES, gameData);
    }

    private static int calculate(int firstNumber, int secondNumber, String operation) {
        return switch (operation) {
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            default -> throw new ArithmeticException();
        };
    }
}
