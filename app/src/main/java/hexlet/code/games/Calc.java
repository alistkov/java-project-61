package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Calc {
    private static final String RULES = "What is the result of the expression?";
    private static final String[] OPERATIONS = {"+", "-", "*"};
    public static final int ROUNDS = 3;

    public static void startGame() {
        var gameData = new String[3][2];

        for (var i = 0; i < ROUNDS; i++) {
            var operationIndex = Util.generateRandomNumber(0, 3);
            var firstNumber = Util.generateRandomNumber(1, 100);
            var secondNumber = Util.generateRandomNumber(1, 100);
            var operation = OPERATIONS[operationIndex];
            var question = firstNumber + " " + operation + " " + secondNumber;
            var correctAnswer = Util.calculate(firstNumber, secondNumber, operation);
            gameData[i] = new String[] {question, String.valueOf(correctAnswer)};
        }
        Engine.startGame(RULES, gameData, ROUNDS);
    }
}
