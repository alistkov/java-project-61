package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Progression {
    private static final String RULES = "Please enter the game number and press Enter.";
    public static final int ROUNDS = 3;

    public static void startGame() {
        var gameData = new String[3][2];

        for (var i = 0; i < ROUNDS; i++) {
            var progressionData = Util.generateProgression();
            var question = progressionData.get("progression");
            var correctAnswer = progressionData.get("missingElement");
            gameData[i] = new String[] {question, correctAnswer};
        }
        Engine.startGame(RULES, gameData, ROUNDS);
    }
}
