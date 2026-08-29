package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n0 - Exit");
        System.out.print("Your choice: ");

        var sc = new Scanner(System.in);
        var game = sc.next();

        switch (game) {
            case "0" -> System.out.println("See you next time!");
            case "1" -> Cli.run();
            default -> System.out.println("You have entered an incorrect value.");
        }
        sc.close();
    }
}
