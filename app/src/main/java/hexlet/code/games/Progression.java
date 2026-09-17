package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.Constants;
import hexlet.code.utils.Utils;

public class Progression {
    private static final String RULES = "What number is missing in the progression?";
    private static final int PROGRESS_MIN_LENGTH = 5;
    private static final int PROGRESS_MAX_LENGTH = 10;
    private static final int PROGRESS_MIN_VALUE = 2;
    private static final int PROGRESS_MAX_VALUE = 10;

    public static void run() {
        var roundsCount = Constants.ROUNDS;
        var gameData = new String[roundsCount][2];
        for (var i = 0; i < roundsCount; i += 1) {
            gameData[i] = generateQuestionData();
        }
        Engine.run(RULES, gameData);
    }

    private static String[] generateQuestionData() {
        var progression = generateProgression();
        var missedIndex = Utils.generateRandomNumber(0, progression.length);
        var answer = progression[missedIndex];
        progression[missedIndex] = "..";
        var question = String.join(" ", progression);
        return new String[] {question, answer};
    }

    private static String[] generateProgression() {
        var startNumber = Utils.generateRandomNumber(PROGRESS_MIN_VALUE, PROGRESS_MAX_VALUE);
        var step = Utils.generateRandomNumber(PROGRESS_MIN_VALUE, PROGRESS_MAX_VALUE);
        var progressionLength =
                Utils.generateRandomNumber(PROGRESS_MIN_LENGTH, PROGRESS_MAX_LENGTH + 1);
        var progression = new String[progressionLength];

        for (var i = 0; i < progressionLength; i += 1) {
            var progressionElement = startNumber + step * i;
            progression[i] = String.valueOf(progressionElement);
        }

        return progression;
    }
}
