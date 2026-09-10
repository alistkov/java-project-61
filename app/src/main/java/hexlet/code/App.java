package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import java.util.Scanner;

public class App {
    private static final String EXIT_OPTION = "0";
    private static final String GREETING_OPTION = "1";
    private static final String EVEN_GAME = "2";
    private static final String CALC_GAME = "3";

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println(
                """
                    0 - Exit
                    1 - Greet
                    2 - Even
                    3 - Calc
                """);
        System.out.print("Your choice: ");

        var sc = new Scanner(System.in);
        var game = sc.next();

        switch (game) {
            case EXIT_OPTION -> System.out.println("See you next time!");
            case GREETING_OPTION -> Cli.run(sc);
            case EVEN_GAME -> Even.run();
            case CALC_GAME -> Calc.run();
            default -> System.out.println("Unexpected selection.");
        }
        sc.close();
    }
}
