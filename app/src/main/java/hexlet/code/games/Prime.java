package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Prime {
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static final int ROUNDS = 3;

    public static void startGame() {
        var gameData = new String[3][2];

        for (var i = 0; i < ROUNDS; i++) {
            var question = Util.generateRandomNumber(2, 35);
            var correctAnswer = Util.isPrime(question) ? "yes" : "no";
            gameData[i] = new String[] {String.valueOf(question), correctAnswer};
        }
        Engine.startGame(RULES, gameData, ROUNDS);
    }
}
