package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void run() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name?: ");
        var sc = new Scanner(System.in);
        var name = sc.next();
        System.out.println("Hello, " + name + "!");
        sc.close();
    }
}
