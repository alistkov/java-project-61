package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final int ROUNDS = 3;

    public static void startGame(String rules, String[][] gameData, int rounds) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        var name = SCANNER.next();
        System.out.println("Hello, " + name + "!");
        System.out.println(rules);

        for (var i = 0; i < rounds; i++) {
            var currentStep = gameData[i];
            var question = currentStep[0];
            var correctAnswer = currentStep[1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            var userAnswer = SCANNER.next();

            if (!correctAnswer.equals(userAnswer)) {
                System.out.println(
                        "'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was " + "'" + correctAnswer + "'"
                );
                System.out.println("Let's try again, " +  name + "!");
                return;
            }
            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + name + "!");
    }
}
