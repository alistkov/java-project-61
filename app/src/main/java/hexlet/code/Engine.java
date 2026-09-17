package hexlet.code;

import hexlet.code.utils.Constants;
import java.util.Scanner;

public class Engine {

    public static void run(String rules, String[][] gameData) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name?: ");

        var sc = new Scanner(System.in);
        var name = sc.next();

        System.out.printf("Hello, %s!%n", name);
        System.out.println(rules);

        for (var round : gameData) {
            var question = round[Constants.QUESTION_INDEX];
            var answer = round[Constants.ANSWER_INDEX];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            var userAnswer = sc.next();

            if (!answer.equals(userAnswer)) {
                System.out.println(
                        "'"
                                + userAnswer
                                + "'"
                                + " is wrong answer ;(. Correct answer was "
                                + "'"
                                + answer
                                + "'");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + name + "!");

        sc.close();
    }
}
