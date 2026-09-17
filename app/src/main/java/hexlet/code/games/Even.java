package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.Constants;
import hexlet.code.utils.Utils;

public class Even {
    private static final String RULES =
            "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void run() {
        var roundsCount = Constants.ROUNDS;
        var gameData = new String[roundsCount][2];
        for (var i = 0; i < roundsCount; i += 1) {
            gameData[i] = generateQuestionData();
        }
        Engine.run(RULES, gameData);
    }

    private static String[] generateQuestionData() {
        var question =
                Utils.generateRandomNumber(
                        Constants.MIN_RANDOM_NUMBER, Constants.MAX_RANDOM_NUMBER);
        var answer = isEven(question) ? "yes" : "no";
        return new String[] {String.valueOf(question), answer};
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
