package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

import java.util.HashMap;
import java.util.Map;
import static hexlet.code.Engine.ROUNDS;

public class Progression {
    private static final String RULES = "What number is missing in the progression?";
    private static final int PROGRESSION_MIN_LENGTH = 5;
    private static final int PROGRESSION_MAX_LENGTH = 10;
    private static final int START_INDEX = 0;
    private static final int STARTING_NUMBER = 5;
    private static final int STARTING_STEP_NUMBER = 2;
    private static final int MAX_NUMBER = 10;

    public static void startGame() {
        var gameData = new String[ROUNDS][2];

        for (var i = 0; i < ROUNDS; i++) {
            var progressionData = generateProgression();
            var question = progressionData.get("progression");
            var correctAnswer = progressionData.get("missingElement");
            gameData[i] = new String[] {question, correctAnswer};
        }
        Engine.startGame(RULES, gameData);
    }

    private static Map<String, String> generateProgression() {
        var progressionLength = Util.generateRandomNumber(PROGRESSION_MIN_LENGTH, PROGRESSION_MAX_LENGTH);
        var missingIndex = Util.generateRandomNumber(START_INDEX, progressionLength - 1);

        var startElement = Util.generateRandomNumber(STARTING_NUMBER, MAX_NUMBER);
        var step = Util.generateRandomNumber(STARTING_STEP_NUMBER, MAX_NUMBER);
        var map = new HashMap<String, String>();
        var progression = new String[progressionLength];

        for (var i = 0; i < progressionLength; i++) {
            var value = startElement + step * i;
            progression[i] = String.valueOf(value);
        }

        var missingElement = progression[missingIndex];
        progression[missingIndex] = "..";

        map.put("progression", String.join(" ", progression));
        map.put("missingElement", missingElement);

        return map;
    }
}
