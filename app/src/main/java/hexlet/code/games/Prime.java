package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.Constants;
import hexlet.code.utils.Utils;

public class Prime {
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void run() {
        var roundsCount = Constants.ROUNDS;
        var gameData = new String[Constants.ROUNDS][2];
        for (var i = 0; i < roundsCount; i += 1) {
            gameData[i] = generateQuestionData();
        }
        Engine.run(RULES, gameData);
    }

    private static String[] generateQuestionData() {
        var question = Utils.generateRandomNumber(Constants.MIN_RANDOM_NUMBER, Constants.MAX_RANDOM_NUMBER);
        var answer = isPrime(question) ? "yes" : "no";
        return new String[] {String.valueOf(question), answer};
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
