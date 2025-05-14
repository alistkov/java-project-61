package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    private static final int EXIT_OPTION = 0;
    private static final int GREETING_OPTION = 1;
    private static final int EVEN_GAME = 2;
    private static final int CALC_GAME = 3;
    private static final int GCD_GAME = 4;
    private static final int PROGRESSION_GAME = 5;
    private static final int PRIME_GAME = 6;

    public static void main(String[] args) {
        displayMenu();

        Scanner sc = new Scanner(System.in);

        var playerChoice = sc.nextInt();

        switch (playerChoice) {
            case GREETING_OPTION:
                Cli.greeting(sc);
                break;
            case EVEN_GAME:
                Even.startGame();
                break;
            case CALC_GAME:
                Calc.startGame();
                break;
            case GCD_GAME:
                GCD.startGame();
                break;
            case PROGRESSION_GAME:
                Progression.startGame();
                break;
            case PRIME_GAME:
                Prime.startGame();
                break;
            case EXIT_OPTION:
                System.exit(0);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + playerChoice);
        }
        sc.close();
    }

    public static void displayMenu() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
    }
}
