package hexlet.code;

import java.util.Scanner;

public class GameEngine {
    public static final int ROUNDS = 3;

    public static void run(String rules, String[][] gameData) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name?: ");
        var sc = new Scanner(System.in);
        var name = sc.next();
        System.out.println("Hello, %s!".formatted(name));
        System.out.println(rules);
        for (var round: gameData) {
            var question = round[0];
            var answer = round[1];
            System.out.println("Question %s".formatted(question));
            System.out.print("Your answer: ");
            var userAnswer = sc.next();
            if (!answer.equals(userAnswer)) {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.".formatted(userAnswer, answer));
                System.out.printf("Let's try again, %s!".formatted(name));
                return;
            }
            System.out.println("Correct!");
        }

        System.out.printf("Congratulations, %s!".formatted(name));

        sc.close();
    }
}
