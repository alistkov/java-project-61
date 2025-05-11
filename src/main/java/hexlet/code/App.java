package hexlet.code;

import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    private static final int GREETING_OPTION = 1;
    private static final int EVEN_GAME = 2;
    private static final int EXIT_OPTION = 0;

    public static void main(String[] args) {
        displayMenu();

        Scanner sc = new Scanner(System.in);

        var playerChoice = sc.nextInt();

        switch (playerChoice) {
            case GREETING_OPTION:
                Cli.greeting(sc);
                break;
            case EVEN_GAME:
                Even.startGame(sc);
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
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
    }
}
