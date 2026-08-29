package hexlet.code.games;

import hexlet.code.GameEngine;
import hexlet.code.Utils;

public class Even {
    private static final String RULES =
            "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void run() {
        var roundsCount = GameEngine.getRoundsCount();
        var gameData = new String[roundsCount][2];
        for (var i = 0; i < roundsCount; i += 1) {
            var question =
                    Utils.generateRandomNumber(
                            GameEngine.getMinRandomNumber(), GameEngine.getMaxRandomNumber());
            var answer = isEven(question) ? "yes" : "no";
            gameData[i] = new String[] {String.valueOf(question), answer};
        }

        GameEngine.run(RULES, gameData);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
