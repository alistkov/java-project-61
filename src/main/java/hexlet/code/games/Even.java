package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;


public class Even {
    public static void startGame(Scanner sc) {
        var steps = 3;
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        var name = sc.next();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        while (steps > 0) {
            var number = generateNumber();
            var correctAnswer = isEven(number) ? "yes" : "no";

            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            var userAnswer = sc.next();

            if (!correctAnswer.equals(userAnswer)) {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was " + "'" + correctAnswer + "'");
                return;
            }

            System.out.println("Correct!");

            steps -= 1;
        }

        System.out.println("Congratulations, " + name + "!");
    }

    private static int generateNumber() {
        var rnd = new Random();
        return rnd.nextInt(1, 100);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
