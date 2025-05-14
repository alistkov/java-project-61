package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;
import static hexlet.code.Engine.ROUNDS;

public class Prime {
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MIN = 2;
    private static final int MAX = 50;

    public static void startGame() {
        var gameData = new String[ROUNDS][2];

        for (var i = 0; i < ROUNDS; i++) {
            var question = Util.generateRandomNumber(MIN, MAX);
            var correctAnswer = isPrime(question) ? "yes" : "no";
            gameData[i] = new String[] {String.valueOf(question), correctAnswer};
        }
        Engine.startGame(RULES, gameData);
    }

    private static boolean isPrime(int number) {
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
