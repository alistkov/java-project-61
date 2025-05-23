package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;
import static hexlet.code.Engine.ROUNDS;

public class Even {
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MIN = 2;
    private static final int MAX = 100;

    public static void startGame() {
        var gameData = new String[ROUNDS][2];

        for (var i = 0; i < ROUNDS; i++) {
            var question = Util.generateRandomNumber(MIN, MAX);
            var correctAnswer = isEven(question) ? "yes" : "no";
            gameData[i] = new String[] {String.valueOf(question), correctAnswer};
        }
        Engine.startGame(RULES, gameData);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
