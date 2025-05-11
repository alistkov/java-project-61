package hexlet.code;

import java.util.Scanner;

public class App {
    private static final int GREETING_OPTION = 1;
    private static final int EXIT_OPTION = 0;

    public static void main(String[] args) {
        displayMenu();

        Scanner sc = new Scanner(System.in);

        var playerChoice = sc.nextInt();
        System.out.println("\n");

        switch (playerChoice) {
            case GREETING_OPTION:
                Cli.greeting(sc);
                break;
            case EXIT_OPTION:
                System.exit(0);
        }
        sc.close();
    }

    public static void displayMenu() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
    }
}
