package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Even {
    public static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static final int ROUNDS = 3;

    public static void startGame() {
        var gameData = new String[3][2];

        for (var i = 0; i < ROUNDS; i++) {
            var question = Util.generateRandomNumber(1, 100);
            var correctAnswer = Util.isEven(question) ? "yes" : "no";
            gameData[i] = new String[] {String.valueOf(question), correctAnswer};
        }
        Engine.startGame(RULES, gameData, ROUNDS);
    }
}
